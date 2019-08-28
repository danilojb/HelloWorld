package com.danilojb.HelloWorld

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController{
    @RequestMapping("/")
    fun HelloWorld(): String {
        var nome = "Hello world!!"
        return nome
    }
}