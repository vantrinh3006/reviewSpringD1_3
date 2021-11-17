package com.example.controllers;

import com.example.dao.UserDao;
import com.example.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String checkLogin(@RequestParam("name") String name, @RequestParam("password") String password, Model model
            , HttpServletRequest req){
        UserModel user =userDao.checkLogin(name,password);
        if (user != null){
            if (user.getActive()==0){
                model.addAttribute("msg","tài khoản bị khóa");
                return "redirect:/login";
            }else {
                HttpSession session =req.getSession();
                session.setAttribute("user",user);
                return "blog.index";
            }
        }
        else {
            return "redirect:/login";
        }
    }
}
