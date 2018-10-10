package com.example.jwt2.domain;

import lombok.Getter;

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

    private String getMyName() {
        return this.name();
    }

    public String getRoleName() {
        return roleName;
    }
}
