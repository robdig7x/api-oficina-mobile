package com.oficinamobile.api.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oficinamobile.api.model.Cliente;
import com.oficinamobile.api.service.ClientService;

import lombok.RequiredArgsConstructor;

@RequestMapping("cliente")
@RestController
@RequiredArgsConstructor
public class ClientController {
	
	private final ClientService service;
	
	@GetMapping
	public List<Cliente> buscarTodosClientes(Cliente person, @Param("keyword") String keyword) {
		return service.findAll(keyword);
	}
	
	@PostMapping
	public String adicionaCliente(@RequestBody Cliente cliente) {
		service.save(cliente);
		return "ok";
	}
	
	@DeleteMapping
	public String deleteUser(@PathVariable("id") String id) {
	    return "Ainda não";
	}
}
