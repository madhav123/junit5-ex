package com.dizzy.mockito.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.dizzy.model.Accounts;
import com.dizzy.repository.AccountsRepository;
import com.dizzy.service.AccountService;

@ExtendWith(SpringExtension.class)

public class AccountServiceWithMockTest {

	@InjectMocks
	AccountService accountService;	
	@Spy
	AccountsRepository accountsRepository;

	@Test
	public void test1() {
		Accounts mockResponse = new Accounts();
		mockResponse.setBranchAddress("hyd");
		Mockito.when(accountsRepository.findByCustomerId(Mockito.anyInt())).thenReturn(mockResponse);
		Accounts account = accountService.getAccountDetails(0);
		System.out.println("account" + account.getBranchAddress());
		assertEquals("hyd", account.getBranchAddress());
	}
}

