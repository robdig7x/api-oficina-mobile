package com.oficinamobile.api.repository;

import org.springframework.stereotype.Repository;

import com.oficinamobile.api.model.Cliente;
import com.oficinamobile.api.service.firebase.FireStoreRepository;

@Repository
public class ClientRepository implements FireStoreRepository<Cliente> {
}
