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
public class insertController {
    @Autowired
    private MoneyRepository moneyRepository;
    @GetMapping("/insert")
    public String home(Model model) {
        if(WebBankApplication.name==null||WebBankApplication.money==null)
            return "redirect:/";
        else {
            model.addAttribute("amount", WebBankApplication.money);
            return "insert";
        }
    }
    @PostMapping("/insert")
    public String insertMoney(@RequestParam Integer Money)
    {
        Money money = new Money(WebBankApplication.id+1,WebBankApplication.money+Money,WebBankApplication.id);
        WebBankApplication.money=WebBankApplication.money+Money;
        moneyRepository.save(money);
        return "redirect:/main";
    }
}
