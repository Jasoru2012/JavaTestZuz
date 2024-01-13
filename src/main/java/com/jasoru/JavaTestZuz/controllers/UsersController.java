package com.jasoru.JavaTestZuz.controllers;

import jakarta.jws.WebParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UsersController {

    @GetMapping()
    public String user_id(Model Users) {
        return null;
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model Users) {
        return null;
    }

}
