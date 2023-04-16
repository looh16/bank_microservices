package com.cards.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cards.api.models.Cards;


public interface CardsRepository extends CrudRepository<Cards, Long> {

	
	List<Cards> findByCustomerId(int customerId);

}
