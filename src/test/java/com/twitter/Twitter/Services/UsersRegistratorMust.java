package com.twitter.Twitter.Services;

import com.twitter.Twitter.Exceptions.NicknameAlreadyExistException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersRegistratorMust{
    @Test
    public void the_user_can_register () throws NicknameAlreadyExistException {
        UsersRegistrator algorithm = new UsersRegistrator();
        algorithm.createUser("LuBuon", "Lucia");
        assertTrue(algorithm.users.containsKey("LuBuon"));
    }
    @Test
    public void the_user_cant_register () throws NicknameAlreadyExistException {
        UsersRegistrator algorithm = new UsersRegistrator();
        algorithm.createUser("LuBuon", "Lucia");
        try {
            algorithm.createUser("LuBuon", "Lucia");
            fail("Expected exception was not occured.");
        } catch(NicknameAlreadyExistException exception) {

        }

    }

}