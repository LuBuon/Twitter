package com.twitter.Twitter.Models;

public class User {

    private final String name;
    private final String nickName;

    public User(String nickname, String name) {
        this.nickName = nickname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }



}
