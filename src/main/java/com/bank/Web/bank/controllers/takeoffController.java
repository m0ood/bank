package com.bank.Web.bank.controllers;

import com.bank.Web.bank.WebBankApplication;
import com.bank.Web.bank.models.Money;
import com.bank.Web.bank.repo.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class takeoffController {
    @Autowired
    private MoneyRepository moneyRepository;
    @GetMapping("/takeoff")
    public String home(Model model) {
        if(WebBankApplication.name==null||WebBankApplication.money==null)
            return "redirect:/";
        else {
            model.addAttribute("amount", WebBankApplication.money);
            return "takeoff";
        }
    }
    @PostMapping("/takeoff")
    public String takeoffMoney(@RequestParam Integer Money)
    {
        if(Money<WebBankApplication.money){
        moneyRepository.save(new Money(WebBankApplication.id+1,WebBankApplication.money-Money,WebBankApplication.id));
            WebBankApplication.money=WebBankApplication.money-Money;}
        return "redirect:/main";
    }
}
