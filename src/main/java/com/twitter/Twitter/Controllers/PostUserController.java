package com.twitter.Twitter.Controllers;

import com.twitter.Twitter.Services.UsersRegistrator;
import com.twitter.Twitter.repositories.InMemoryUsers;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/register/")
public class PostUserController {

    private final UsersRegistrator usersRegistrator = new UsersRegistrator(new InMemoryUsers());

    @PostMapping("{nickname}/{name}")
    @ResponseBody
    public String postUser (@PathVariable("nickname") String nickname, @PathVariable("name") String name) {
        usersRegistrator.createUser(nickname, name);
        return "Hola " + name +","+ nickname ;
    }







}
