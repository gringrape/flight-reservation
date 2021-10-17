package com.gringrape.msreservation

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest
@AutoConfigureWebTestClient
class MsReservationApplicationTests {
    @Test
    fun helloWorldTest(@Autowired client: WebTestClient) {
        client.get().uri("/").exchange()
            .expectStatus().isOk
            .expectBody()
    }
}
