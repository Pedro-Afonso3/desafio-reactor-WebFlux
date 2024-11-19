package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        return Flux.fromIterable(users) // Cria um Flux a partir da lista de usuários
                            .filter(User::isAdmin) // Filtra apenas os usuários que são administradores
                            .count(); // Conta quantos usuários passaram pelo filtro e retorna um Mono<Long>
    }
}
