package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutString {

   @RequestMapping("/")

    public String letters(){
       String result="programming is fun";
       String aa="";
       System.out.println(result.toUpperCase());
       aa+="<br/n>" + result.toUpperCase();
       System.out.println(result.toLowerCase());
      aa+="<br/n>" + result.toLowerCase();

       return aa;
   }

}
