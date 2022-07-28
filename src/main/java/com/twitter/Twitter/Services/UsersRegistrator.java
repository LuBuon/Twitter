package com.twitter.Twitter.Services;
import com.twitter.Twitter.Models.User;
import com.twitter.Twitter.repositories.Users;

public class UsersRegistrator {

    private final Users users;

    public UsersRegistrator(Users users) {
        this.users = users;
    }

    public void createUser(String nickname, String name) {
       users.create(new User(nickname , name));
    }

    public User readUserName(String nickname) {users.read(User (nickname))    }

}
