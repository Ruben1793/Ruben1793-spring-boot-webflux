package com.bolsadeideas.springboot.webflux.app.models.services;

import com.bolsadeideas.springboot.webflux.app.models.documents.Categoria;
import com.bolsadeideas.springboot.webflux.app.models.documents.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

    Flux<Producto> findAll();

    Flux<Producto> findAllConNombreUpperCase();

    Flux<Producto> findAllConNombreUpperCaseRepeat();

    Mono<Producto> findById(String id);

    Mono<Producto> save(Producto producto);

    public Mono<Void> delete(Producto producto);

    public Flux<Categoria> findAllCategoria();

    public Mono<Categoria> findCategoriaById(String id);

    public Mono<Categoria> saveCategoria(Categoria categoria);


}
