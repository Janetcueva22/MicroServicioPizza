package com.idat.MicroservicioPizza.service;

import java.util.List;

import com.idat.MicroservicioPizza.model.Pizza;

public interface IPizzaService {
	
	public List<Pizza> listarPizzas();
	public void guardarPizza(Pizza pizz);
}
