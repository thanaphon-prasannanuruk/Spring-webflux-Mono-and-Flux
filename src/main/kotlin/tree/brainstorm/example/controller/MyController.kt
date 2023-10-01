package tree.brainstorm.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import tree.brainstorm.example.service.MyService


@RestController

class MyController(private val myService: MyService) {

    @GetMapping("/dog")
    fun getMonoDog(): Mono<String> {
        return myService.fetchMonoDog()

    }

    @GetMapping("/cats")
    fun getFluxCats(): Flux<String> {
        return myService.fetchFluxCats()
    }

}


