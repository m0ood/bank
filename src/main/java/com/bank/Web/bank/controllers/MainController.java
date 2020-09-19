package com.bank.Web.bank.controllers;

import com.bank.Web.bank.WebBankApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home() {
        WebBankApplication.money=null;
        WebBankApplication.name=null;
        WebBankApplication.id=null;
        return "home";
    }
}
