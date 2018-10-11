package com.example.jwt2.domain;

import lombok.Getter;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by ehay@naver.com on 2018-10-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public enum UserRole {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String roleName;

    UserRole(String roleName) {
        this.roleName = roleName;
    }

    public boolean isCorrectName(String name) {
        return name.equalsIgnoreCase(this.roleName);
    }

    public static UserRole getRoleByName(String roleName) {
        return Arrays.stream(UserRole.values()).filter(r -> r.isCorrectName(roleName)).findFirst().orElseThrow(() -> new NoSuchElementException("검색된 권한이 없습니다."));
    }

    public String getRoleName() {
        return roleName;
    }
}
