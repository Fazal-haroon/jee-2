package com.demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    @ResponseBody
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLoginRequest(@RequestParam(name = "name") String name, @RequestParam(name = "password") String password, ModelMap modelMap){
        System.out.println("name = " + name);
        System.out.println("password = " + password);
        modelMap.put("name", name);
        modelMap.put("password", password);
        return "welcome";
    }
}
