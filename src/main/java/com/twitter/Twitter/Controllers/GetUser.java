package com.twitter.Twitter.Controllers;

import com.twitter.Twitter.Services.UsersRegistrator;
import com.twitter.Twitter.repositories.InMemoryUsers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register/")
public class GetUser {
    private final UsersRegistrator usersRegistrator = new UsersRegistrator(new InMemoryUsers());

    @GetMapping("{nickname}/{}")
    @ResponseBody

    public String getUser (@PathVariable("nickname") String nickname, @PathVariable("name") String name) {
        usersRegistrator.readUserName(nickname);
        return "Hola " + name +","+ nickname ;
    }

}
