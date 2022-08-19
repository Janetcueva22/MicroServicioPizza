package com.idat.MicroservicioPizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioPizza.model.Pizza;
import com.idat.MicroservicioPizza.repository.IPizzaRepository;

@Service
public class PizzaServiceImpl implements IPizzaService{

	@Autowired private IPizzaRepository repository;
	
	@Override
	public List<Pizza> listarPizzas() {
		return repository.findAll();
	}

	@Override
	public void guardarPizza(Pizza pizz) {
		repository.save(pizz);
	}
}
