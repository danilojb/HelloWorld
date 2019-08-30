package com.danilojb.HelloWorld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController{

    @GetMapping("/")
    fun HelloWorld(
            @RequestParam(value = "nome") nome: String,
            @RequestParam(value ="cognome") cognome: String
    ) = Name("$nome", "$cognome")
}