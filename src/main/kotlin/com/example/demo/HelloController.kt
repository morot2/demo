package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HelloController {

    @GetMapping("/")
    fun root(): String {
        return "root index"
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "hello world"
    }

    @GetMapping("/time")
    fun time(): String {
        return LocalDateTime.now().toString()
    }
}