package com.alex.demo.cicd

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HomeController {


    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello"
    }



}