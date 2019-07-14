package com.Codeup.blogspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    /**
     *
             || url          	     ||response
             +++++++++++++++++++++++++++++++++++
             || /add/3/and/4	     ||  7
             || /subtract/3/from/10  ||  7
             || /multiply/4/and/5	 ||  20
             || /divide/6/by/3	     ||  2
     *
     * */
    @RequestMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add (@PathVariable int num1, @PathVariable int num2){
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @RequestMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subtract (@PathVariable int num1, @PathVariable int num2){
        return num2 + " - " + num1 + " = " + (num2 - num1);
    }

    @RequestMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiply (@PathVariable int num1, @PathVariable int num2){
        return num2 + " x " + num1 + " = " + (num2 * num1);
    }

    @RequestMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public String divide (@PathVariable int num1, @PathVariable int num2){
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }





}
