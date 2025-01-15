package com.AutoServicio.gestion_de_autoservicio.presentation.controller;

import com.AutoServicio.gestion_de_autoservicio.presentation.dto.UserDTO;
import com.AutoServicio.gestion_de_autoservicio.service.interfaces.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello private";
    }

    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("user", new UserDTO());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserDTO userDTO){
        userService.create(userDTO);
        return "index";
    }
}
