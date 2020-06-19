package com.bff.controller;

import com.bff.entity.Account;
import com.bff.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 案例
 */
@Controller()
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(value = "/saveAccount")
    public String  saveAccount(Account account){
        System.out.println("成功");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义转换器
     * @param user
     * @return
     */
    @RequestMapping(value = "/saveUser")
    public String  saveUser(User user){
        System.out.println("成功");
        System.out.println(user);
        return "success";
    }
}
