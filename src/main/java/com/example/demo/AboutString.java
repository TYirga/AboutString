package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutString {

   @RequestMapping("/")

    public String letters(){
       String result="programming is fun";
       System.out.println(result.toUpperCase());
       result+="<br/n>" + result.toUpperCase();
       System.out.println(result.toLowerCase());
      result+="<br/n>" + result.toLowerCase();

       return result;
   }

}
