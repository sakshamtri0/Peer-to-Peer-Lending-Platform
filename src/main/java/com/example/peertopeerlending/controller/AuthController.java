package com.example.peertopeerlending.controller;

import com.example.peertopeerlending.model.User;
import com.example.peertopeerlending.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    // Show registration form
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // maps to templates/register.html
    }

    // Process registration form
    @PostMapping("/register")
    public String processRegister(@ModelAttribute("user") User user) {
        userService.registerUser(user);
        return "redirect:/login";
    }

    // Show login form
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // maps to templates/login.html
    }

    // Redirect after login based on role
    @GetMapping("/dashboard")
    public String dashboard(Authentication auth) {
        String role = auth.getAuthorities().iterator().next().getAuthority();

        if ("ADMIN".equals(role)) {
            return "redirect:/admin/dashboard";
        } else if ("CUSTOMER".equals(role)) {
            return "redirect:/customer/dashboard";
        } else {
            return "redirect:/login?error"; // fallback for unknown roles
        }
    }
}
