package com.example.controllers;

import com.example.utils.AuthUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class IndexController {
    @GetMapping("index")
    public String index(HttpServletRequest req, HttpServletResponse resp){
        try {
            if (!AuthUtil.checkLogin(req,resp)){
                return "login";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "blog.index";
    }
    @GetMapping("about")
    public String about(HttpServletRequest req, HttpServletResponse resp){
        try {
            if (!AuthUtil.checkLogin(req,resp)){
                return "login";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "blog.about";
    }
    @GetMapping("contact")
    public String contact(HttpServletRequest req, HttpServletResponse resp){
        try {
            if (!AuthUtil.checkLogin(req,resp)){
                return "login";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "blog.contact";
    }
    @GetMapping("post")
    public String post(HttpServletRequest req, HttpServletResponse resp){
        try {
            if (!AuthUtil.checkLogin(req,resp)){
                return "login";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "blog.post";
    }
}
