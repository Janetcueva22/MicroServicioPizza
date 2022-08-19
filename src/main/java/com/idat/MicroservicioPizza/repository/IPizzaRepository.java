package com.idat.MicroservicioPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.MicroservicioPizza.model.Pizza;

public interface IPizzaRepository extends JpaRepository<Pizza, Integer>{

}
