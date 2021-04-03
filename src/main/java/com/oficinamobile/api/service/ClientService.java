package com.oficinamobile.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.oficinamobile.api.model.Cliente;
import com.oficinamobile.api.repository.ClientRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ClientService {
	
	private final ClientRepository repository;
	
	public Optional<Cliente> findById(String id) {
		log.info("Buscando por ID: {}", id);
		return repository.findById(id);
	}
	
	public List<Cliente> findAll(String nome) {
		log.info("Buscando todos Clientes cadastrados");
		// Criar padrão Builder
		// findBy(field campo).where(filter filter).get();
//		if (!ObjectUtils.isEmpty(nome))
//			return repository.findByNomeContainingIgnoreCase(nome);
		
		return repository.findAll();
	}
	
	public void save(Cliente cliente) {
		repository.save(cliente);
	}

	public void delete(Cliente cliente) {
		repository.delete(cliente);
	}
}
