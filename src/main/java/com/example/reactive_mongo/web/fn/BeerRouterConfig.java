package com.example.reactive_mongo.web.fn;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class BeerRouterConfig {
    public static String BEER_PATH = "/api/v3/beer";

    public static String BEER_PATH_ID = BEER_PATH + "/{beerId}";

    private final BeerHandler beerhandler;

    @Bean
    public RouterFunction<ServerResponse> beerRoutes(){
        return route()
                .GET(BEER_PATH, accept(APPLICATION_JSON), beerhandler::listBeers)
                .GET(BEER_PATH_ID, accept(APPLICATION_JSON), beerhandler::getBeerById)
                .POST(BEER_PATH, accept(APPLICATION_JSON), beerhandler::createNewBeer)
                .PUT(BEER_PATH_ID, accept(APPLICATION_JSON), beerhandler::updateBeerById)
                .PATCH(BEER_PATH_ID, accept(APPLICATION_JSON), beerhandler::patchBeerById)
                .DELETE(BEER_PATH_ID, accept(APPLICATION_JSON), beerhandler::deleteBeerById)
                .build();
    }
}
