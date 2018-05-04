package com.lo54.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lo54.entities.Client;

public interface ClientRepository extends JpaRepository<Client , Integer> {

}
