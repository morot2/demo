package com.example.demo.api

import com.example.demo.repository.Vote
import com.example.demo.repository.VoteRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HelloController(
        val voteRepository: VoteRepository
) {

    @GetMapping("/")
    fun root(): String {
        return "root index"
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "hello world"
    }

    @PostMapping("/save")
    fun redisTest(@RequestBody vote: Vote): String {
        voteRepository.save(vote)
        return "ok"
    }

    @GetMapping("/time")
    fun time(): String {
        return LocalDateTime.now().toString()
    }
}