package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public Mono<Void> userIsValid(final User user){
        return Mono.just(user)
                .flatMap(u -> { if (u.password().length() > 8)
                { return Mono.empty();
                } else
                { return Mono.error(new IllegalArgumentException("Senha inválida: deve ter mais de 8 caracteres"));
                }
                });



    }

}
