package com.accounts.api.integ;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.accounts.api.dto.Loans;
import com.accounts.api.models.Customer;


@FeignClient("loans")
public interface LoansClient {

	@PostMapping(value = "myLoans", consumes = "application/json")
	List<Loans> getLoansDetails(@RequestHeader("bank-correlation-id") String correlationid,@RequestBody Customer customer);
}