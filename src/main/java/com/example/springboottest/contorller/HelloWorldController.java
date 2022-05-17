package com.example.springboottest.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since 2022/5/7 17:26
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloTest(){
        return "Hello,World!";
    }

//github test push
}
