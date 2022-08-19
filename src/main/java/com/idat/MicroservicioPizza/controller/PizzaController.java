package com.idat.MicroservicioPizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.idat.MicroservicioPizza.model.Pizza;
import com.idat.MicroservicioPizza.service.IPizzaService;

@Controller
@RequestMapping("/api/v1/pizza")
public class PizzaController {

@Autowired private IPizzaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizzas(){
		return service.listarPizzas();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizz) {
		service.guardarPizza(pizz);
	}
}
