package com.springboot.kotlintest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping
     fun helloWorld(): String = "Hello, this is a REST endpoint!"
//    fun helloWorld(): String {
//        return "Hello, this is a REST endpoint!"
//    }


}