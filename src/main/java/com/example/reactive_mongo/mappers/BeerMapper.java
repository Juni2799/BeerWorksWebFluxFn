package com.example.reactive_mongo.mappers;

import com.example.reactive_mongo.domain.Beer;
import com.example.reactive_mongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
