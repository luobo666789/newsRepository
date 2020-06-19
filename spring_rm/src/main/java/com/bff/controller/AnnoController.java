package com.bff.controller;

import com.bff.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * 案例
 */
@Controller()
@RequestMapping("/anno")
@SessionAttributes("msg")  //把msg=妹妹存入到session域对象中
public class AnnoController {

    @RequestMapping(value = "/testRequestParam")
    public String  testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("成功");
        System.out.println(username);
        return "success";
    }

    @RequestMapping(value = "/testRequestBody")
    public String  testRequestBody(@RequestBody String body){
        System.out.println("成功");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}")
    public String  testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("请求成功");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头信息
     * @param header
     * @return
     */
    @RequestMapping(value = "/testRequestHeader")
    public String  testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("请求成功");
        System.out.println(header);
        return "success";
    }

    /**
     * 获得cookie的值
     * @param cookieValue
     * @return
     */
    @RequestMapping(value = "/testCookieValue")
    public String  testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){
        System.out.println("请求成功");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute注解
     * @param user
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public String  testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("请求成功");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        System.out.println("showUser执行了。。。。");
        //通过用户查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(24);
        user.setBirthday(new Date());
        map.put("abc",user);
    }

    /**
     * SessionAttributes的注解
     * @param model
     * @return
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String  testSessionAttributes(Model model){
        System.out.println("请求成功");
        model.addAttribute("msg","妹妹");
        return "success";
    }

    /**
     * 获取值
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/getSessionAttributes")
    public String  getSessionAttributes(ModelMap modelMap){
        System.out.println("请求成功");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 清除
     * @param sessionStatus
     * @return
     */
    @RequestMapping(value = "/delSessionAttributes")
    public String  delSessionAttributes(SessionStatus sessionStatus){
        System.out.println("请求成功");
        sessionStatus.setComplete();
        return "success";
    }
}
