package com.pirate.client;

import java.math.BigDecimal;

import com.pirate.repo.Repository;
import com.pirate.service.WalletService;
import com.pirate.service.WalletServiceImpl;

public class Main {
	public static void main(String[] args) {
		WalletServiceImpl service = new WalletService(new Repository());
		
		String[] name = {"Shubham Kumar", "Rakesh Sharma", "Rahul Kumar", "Yanshu Gupta"};
		String[] mobile = {"9897959493", "8769857869", "7678909876", "9898787654"};
		int[] walletId = {1234, 5463, 2536, 9864};
		BigDecimal[] balance = {new BigDecimal("5400"), new BigDecimal("75000"), new BigDecimal("15400"), new BigDecimal("10000")};
		
		for(int i=0; i<name.length; i++) {
			service.createAccount(name[i], mobile[i], walletId[i], balance[i]);
			System.out.println(service.createAccount(name[i], mobile[i], walletId[i], balance[i]));
		}
		
		System.out.println(service.showByName("Shubham Kuma"));
		
		
	}
}
