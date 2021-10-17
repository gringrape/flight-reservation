package com.gringrape.msreservation

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class Router(private val handler: Handler) {
    @Bean
    fun routerFunction() = router {
        GET("/", handler::hello)
    }
}
