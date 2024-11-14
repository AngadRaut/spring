package com.springmvc.controller;

import com.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.service.UserService;


@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @RequestMapping("/contact")
    public String showForm(){
        return "contact";
    }

  /*  @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String processForm(@RequestParam("email") String userEmail,
                              @RequestParam("userName") String userName,
                              @RequestParam("userPassword") String userPassword , Model model){
        *//*System.out.println("user name"+userName);
        System.out.println("user email"+userEmail);
        System.out.println("user password"+userPassword);
        model.addAttribute("name",userName);
        model.addAttribute("mail",userEmail);
        model.addAttribute("pass",userPassword);*//*

        User user = new User();
        user.setUserName(userName);
        user.setUserName(userEmail);
        user.setUserName(userPassword);

        model.addAttribute(user);
        return "processForm";
    }*/

    @RequestMapping(path = "/processForm",method = RequestMethod.POST)
    public String processForm(@ModelAttribute ("user")User user,Model model){
        System.out.println(user);
        if(user.getUserName().isBlank()){
            return "redirect:/contact";
        }
         this.userService.createUser(user);
        return "processForm";
    }
}
