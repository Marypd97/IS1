package com.example.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.domain.Account;
import com.example.domain.Transfer;


public interface TransferRepository extends CrudRepository<Transfer, Long> {

	@Query("SELECT a FROM Transfer a WHERE a.numeroOperacion = ?1")
	Account findByNumero(Long numeroOperacion);

	// select a.* from account a
	@Query("SELECT a FROM Transfer a")
	Collection<Transfer> findAll();
	

}
