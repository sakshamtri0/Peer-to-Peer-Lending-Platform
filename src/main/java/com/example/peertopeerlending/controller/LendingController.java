package com.example.peertopeerlending.controller;

import com.example.peertopeerlending.model.LoanApplication;
import com.example.peertopeerlending.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LendingController {

    @Autowired
    private LoanApplicationRepository repository;

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("applications", repository.findAll());
        return "index";
    }

    @PostMapping("/apply")
    public String applyForLoan(@RequestParam String name, @RequestParam double amount, Model model) {
        LoanApplication application = new LoanApplication();
        application.setName(name);
        application.setAmount(amount);
        repository.save(application);
        model.addAttribute("name", name);
        model.addAttribute("amount", amount);
        return "confirmation";
    }
}