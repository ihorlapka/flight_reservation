package com.ihor.flight_reservation.controllers;

import com.ihor.flight_reservation.entities.User;
import com.ihor.flight_reservation.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/showReg")
    public String showRegistrationPage(){
        return "login/registerUser";
    }

    @GetMapping("/login")
    public String showLogin(){
        return "login/login";
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String register(@ModelAttribute(name = "user")User user){
        userRepository.save(user);
        return "login/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email")String email, @RequestParam("password")String password, Model model){
        User user = userRepository.findUserByEmail(email);
        if (password.equals(user.getPassword())){
            return "findFlights";
        }else {
            model.addAttribute("msg", "Invalid usernamme or password, try again!");
        }
        return "login/login";
    }
}
