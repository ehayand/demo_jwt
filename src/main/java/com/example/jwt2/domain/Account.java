package com.example.jwt2.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ehay@naver.com on 2018-10-09
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ACCOUNT_USERNAME")
    private String userName;

    @Column(name = "ACCOUNT_LOGINID")
    private String userId;

    @Column(name = "ACCOUNT_PASSWORD")
    private String password;

    @Column(name = "ACCOUNT_ROLE")
    @Enumerated(value = EnumType.STRING)
    private UserRole userRole;

    @Column(name = "ACCOUNT_SOCIAL_ID")
    private Long socialId;

    @Column(name = "ACCOUNT_SOCIAL_PROFILEPIC")
    private String profileHref;

    public Account() {
    }

    public Account(String userName, String userId, String password, UserRole userRole, Long sosialId, String profileHref) {
        this.userName = userName;
        this.userId = userId;
        this.password = password;
        this.userRole = userRole;
        this.socialId = sosialId;
        this.profileHref = profileHref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Long getSosialId() {
        return socialId;
    }

    public void setSosialId(Long sosialId) {
        this.socialId = sosialId;
    }

    public String getProfileHref() {
        return profileHref;
    }

    public void setProfileHref(String profileHref) {
        this.profileHref = profileHref;
    }
}
