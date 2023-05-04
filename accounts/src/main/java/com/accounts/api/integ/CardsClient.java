package com.accounts.api.integ;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.accounts.api.dto.Cards;
import com.accounts.api.models.Customer;


@FeignClient("cards")
public interface CardsClient {

	@PostMapping(value = "myCards", consumes = "application/json")
	List<Cards> getCardDetails(@RequestHeader("bank-correlation-id") String correlationid, @RequestBody Customer customer);
}