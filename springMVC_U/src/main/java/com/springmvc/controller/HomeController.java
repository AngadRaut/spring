package com.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("this is home url");
        model.addAttribute("Name","Mukesh Ambani");
        model.addAttribute("id",1001);

        List<String> friends = new ArrayList<>();
        friends.add("nana");
        friends.add("madhuri");
        friends.add("rawan");

        model.addAttribute("friends",friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("this is about url");
        return "about";
    }

    // help url page
    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sport","cricket");
        modelAndView.addObject("sportsId",199);
        LocalDateTime localDateTime = LocalDateTime.now();
        modelAndView.addObject("now",localDateTime);
        modelAndView.setViewName("/help");

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        modelAndView.addObject("list",list);

        return modelAndView;
    }
}
