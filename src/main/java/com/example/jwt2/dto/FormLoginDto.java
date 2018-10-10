package com.example.jwt2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ehay@naver.com on 2018-10-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class FormLoginDto {

    @JsonProperty(value = "userId")
    private String id;

    @JsonProperty(value = "password")
    private String password;

    public FormLoginDto() {
    }

    public FormLoginDto(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
