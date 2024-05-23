package com.rikkeiacademy.springinternationalize.controller;

import com.rikkeiacademy.springinternationalize.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping(value = {"/"," /login"})
    public String login(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "login";
    }
}
