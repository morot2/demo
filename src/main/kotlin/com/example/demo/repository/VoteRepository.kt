package com.example.demo.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface VoteRepository : CrudRepository<Vote, String> {
}