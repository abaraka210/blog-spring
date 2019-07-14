package com.Codeup.blogspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping("/posts")
    @ResponseBody
    public String index(){
        return "posts index page";
    }

    @RequestMapping("/posts/{id}")
    @ResponseBody
    public String show(@PathVariable int id){
        return "View an individual post";
    }
    @RequestMapping("/posts/create")
    @ResponseBody
    public String create(){
        return "View the form for creating a post";
    }

}
