package com.romaniuk.controller;

import com.romaniuk.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("formData", new User());
        return "index";
    }

    @PostMapping(value ="/create")
    public String processFormDataRedirect(User user, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("user", user);
        System.out.println("/create site");
        return "result";
    }

    @GetMapping(value ="/display")
    public String processFormDataRedirect(User user){

        return "result";
    }
}

