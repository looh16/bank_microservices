package com.accounts.api.integ;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.accounts.api.dto.Loans;
import com.accounts.api.models.Customer;


@FeignClient("loans")
public interface LoansClient {

	//@RequestMapping(method = RequestMethod.POST, value = "myLoans", consumes = "application/json")
	@PostMapping(value = "myLoans", consumes = "application/json")
	List<Loans> getLoansDetails(@RequestBody Customer customer);
}