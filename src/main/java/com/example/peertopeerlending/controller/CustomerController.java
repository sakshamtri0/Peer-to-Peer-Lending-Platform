// CustomerController.java
package com.example.peertopeerlending.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/dashboard")
    public String customerDashboard(Model model, Authentication auth) {
        model.addAttribute("username", auth.getName());
        model.addAttribute("role", "Customer");
        return "customer-dashboard"; // maps to templates/customer-dashboard.html
    }
}