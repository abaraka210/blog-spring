package com.Codeup.blogspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller /**Defines the class as a controller*/
public class HelloController {

    /**
     *  defines a method that should be invoked when
     *  a GET request is recieved for the specified URI
     *  */
    @GetMapping("/hello")
    @ResponseBody /**the  return from this method should be the body for the response*/
    public String hello(){
        return "Hello form Spring!";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello form " + name + "!";
    }

}
