package com.bank.Web.bank.controllers;

import com.bank.Web.bank.WebBankApplication;
import com.bank.Web.bank.models.Money;
import com.bank.Web.bank.models.User;
import com.bank.Web.bank.repo.MoneyRepository;
import com.bank.Web.bank.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SingInController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MoneyRepository moneyRepository;
    @GetMapping("/singin")
    public String home(Model model) {
        WebBankApplication.id=null;
    return "singin";
    }
    @PostMapping("/singin")
    public String singin(@RequestParam Long ID,@RequestParam String Login, @RequestParam String Password,Model model) {
        User user= userRepository.findById(ID).get();
        if(user.getLogin().equals(Login)&&user.getPassword().equals(Password)) {
            Money money= moneyRepository.findById(ID+1).get();
            WebBankApplication.id=user.getId();
            WebBankApplication.money=money.getMoney();
            WebBankApplication.name=user.getFirst_name();
            return "redirect:/main";
        }
        return "singin";
    }
}
