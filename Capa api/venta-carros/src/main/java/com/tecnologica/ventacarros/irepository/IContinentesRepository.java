package com.tecnologica.ventacarros.irepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecnologica.ventacarros.collection.Continentes;

public interface IContinentesRepository extends MongoRepository<Continentes, String>{

}
