package com.example.jwt2.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by ehay@naver.com on 2018-10-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public interface AccountRepository extends CrudRepository<Account, Long> {

    Optional<Account> findByUserId(String userId);

    Optional<Account> findBySocialId(Long socialId);
}
