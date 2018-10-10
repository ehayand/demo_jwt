package com.example.jwt2;

import com.example.jwt2.domain.Account;
import com.example.jwt2.domain.AccountRepository;
import com.example.jwt2.domain.UserRole;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Jwt2Application {

    public static void main(String[] args) {
        SpringApplication.run(Jwt2Application.class, args);
    }

    @Bean
    CommandLineRunner bootstrapTestAccount(AccountRepository accountRepository, PasswordEncoder passwordEncoder){
        return args -> {
            Account account = new Account(null, "ehay@naver.com", "1234", UserRole.USER, null, null);

            account.setPassword(passwordEncoder.encode("1234"));

            accountRepository.save(account);
        };
    }
}
