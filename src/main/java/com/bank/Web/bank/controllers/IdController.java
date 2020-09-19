package com.bank.Web.bank.controllers;

import com.bank.Web.bank.WebBankApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdController {
    @GetMapping("/id")
    public String home(Model model) {
        if(WebBankApplication.id==null)
            return "redirect:/";
        else {
            model.addAttribute("id", WebBankApplication.id);
            return "id";
        }
    }
}
