package cn.itcast.ssm.controller;

import cn.itcast.ssm.domain.Account;
import cn.itcast.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();
        List<Account> accountList = accountService.findAll();
        mav.addObject("accountList",accountList);
        mav.setViewName("account/list");
        return mav;
    }

    @RequestMapping("add")
    public String add() {
        return "account/add";
    }

    @RequestMapping("saveAccount")
    public String saveAccount(Account account) {
        accountService.addAccount(account);
        return "redirect:list";
    }

}
