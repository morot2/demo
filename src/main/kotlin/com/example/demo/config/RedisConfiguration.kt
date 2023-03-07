package com.example.demo.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisClusterConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@EnableRedisRepositories(basePackages = ["com.example.demo"])
@Configuration
class RedisConfiguration {

    @Value("\${spring.redis.host}")
    lateinit var redisHost: String

    @Value("\${spring.redis.port}")
    var redisPort: Int = 0

    @Bean
    fun redisClusterConfiguration(): RedisClusterConfiguration? {
        val clusterConfiguration = RedisClusterConfiguration()
        clusterConfiguration.clusterNode(redisHost, redisPort)
        LettuceConnectionFactory(clusterConfiguration)
        return clusterConfiguration
    }
}