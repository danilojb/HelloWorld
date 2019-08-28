package com.danilojb.HelloWorld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController{

    @GetMapping("/")
    fun HelloWorld() = Name("Hello World!!!")
}