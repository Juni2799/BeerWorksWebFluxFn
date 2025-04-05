package com.example.reactive_mongo.services;

import com.example.reactive_mongo.domain.Beer;
import com.example.reactive_mongo.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeerService {

    Flux<BeerDTO> listBeers();

    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);

    Mono<BeerDTO> getBeerById(String beerId);

    Mono<Void> deleteBeerById(String beerId);

    Mono<BeerDTO> updateBeerById(String beerId, BeerDTO beerDTO);

    Mono<BeerDTO> patchBeerById(String beerId, BeerDTO beerDTO);

    Mono<BeerDTO> findFirstByBeerName(String beerName);

    Flux<BeerDTO> findByBeerStyle(String beerStyle);
}
