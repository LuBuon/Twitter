package com.twitter.Twitter.repositories;

import com.twitter.Twitter.Models.User;

public interface Users {
    void create(User user);
    String read(User user);
}
