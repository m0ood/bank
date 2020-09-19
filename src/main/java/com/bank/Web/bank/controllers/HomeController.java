package com.bank.Web.bank.controllers;

import com.bank.Web.bank.WebBankApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/main")
    public String home(Model model) {
        if(WebBankApplication.name==null||WebBankApplication.money==null)
        return "redirect:/";
       else{ model.addAttribute("name", WebBankApplication.name);
        model.addAttribute("amount", WebBankApplication.money);
        return "main";}
    }
}