package com.accounts.api.dto;

import java.util.List;

import com.accounts.api.models.Accounts;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Cuerafim
 *
 */
@Getter
@Setter
@ToString
public class CustomerDetails {
	
	private Accounts accounts;
	private List<Loans> loans;
	private List<Cards> cards;
	
	

}
