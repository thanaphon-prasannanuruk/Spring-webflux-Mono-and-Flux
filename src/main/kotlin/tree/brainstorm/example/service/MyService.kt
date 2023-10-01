package tree.brainstorm.example.service

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Service
class MyService {

    fun fetchMonoDog(): Mono<String> {
        return Mono.just("Peter")
    }

    fun fetchFluxCats(): Flux<String> {
        return Flux.just("Funny", "Loving", "Grubby")
    }
}

