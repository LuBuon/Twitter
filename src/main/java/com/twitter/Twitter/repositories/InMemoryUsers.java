package com.twitter.Twitter.repositories;

import com.twitter.Twitter.Exceptions.NicknameAlreadyExistException;
import com.twitter.Twitter.Models.User;

import java.util.HashMap;

public class InMemoryUsers implements Users {
    private final HashMap<String, String> users = new HashMap<>();

    @Override
    public void create(User user) {
        if (users.containsKey(user.getNickName())) {
            throw new NicknameAlreadyExistException("Another person has been already registered using the same nickname");
        } else {
            users.put(user.getNickName(), user.getName());
        }
    }

    @Override
    public String read(User user){
        if (users.containsKey(user.getNickName())) {
            return users.get(user.getNickName());
        } else {
            return "nada";
        }
    }
}
