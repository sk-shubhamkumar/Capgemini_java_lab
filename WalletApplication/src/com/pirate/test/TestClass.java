package com.pirate.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.pirate.bean.Customer;
import com.pirate.bean.Wallet;
import com.pirate.repo.Repository;
import com.pirate.service.WalletService;

class TestClass {

	@Test
	void test() {
		Customer customer = new Customer();
		customer.setName("Pirate");
		Wallet wallet=new Wallet();
		wallet.setBalance(new BigDecimal(69));
		wallet.setWalletId(69);
		customer.setWallet(wallet);
		customer.setMobile("17147714");
		assertEquals(customer, new WalletService(new Repository()).createAccount("Pirate","17147714" , 69,new BigDecimal("69")));
	}

}
