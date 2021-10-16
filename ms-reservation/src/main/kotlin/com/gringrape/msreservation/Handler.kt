package com.gringrape.msreservation

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

@Component
class Handler {
    fun hello(req: ServerRequest): Mono<ServerResponse> = ok()
        .bodyValue("Hello, world")
}
