package com.loans.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.loans.api.models.Loans;


public interface LoansRepository extends CrudRepository<Loans, Long> {

	
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}