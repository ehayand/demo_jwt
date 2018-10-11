package com.example.jwt2.security.provider;

import com.example.jwt2.domain.Account;
import com.example.jwt2.domain.AccountRepository;
import com.example.jwt2.security.AccountContext;
import com.example.jwt2.security.token.PostAuthorizationToken;
import com.example.jwt2.security.token.PreAuthorizationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

/**
 * Created by ehay@naver.com on 2018-10-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Component
public class FormLoginAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        PreAuthorizationToken token = (PreAuthorizationToken) authentication;

        String userName = token.getUserName();
        String password = token.getPassword();

        Account account = accountRepository.findByUserId(userName).orElseThrow(() -> new NoSuchElementException("정보에 맞는 계정이 없습니다."));

        if(isCorrectPassword(password, account)){
            return PostAuthorizationToken.getTokenFromAccountContext(AccountContext.fromAccountModel(account));
        }

        throw new NoSuchElementException("인증 정보가 정확하지 않습니다.");
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return PreAuthorizationToken.class.isAssignableFrom(aClass);
    }

    private boolean isCorrectPassword(String password, Account account){
        return passwordEncoder.matches(password, account.getPassword());
    }
}
