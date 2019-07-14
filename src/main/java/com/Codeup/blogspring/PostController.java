package com.Codeup.blogspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping("/posts")
    @ResponseBody
    public String index(){
        return "posts index page";
    }


}
