package com.pirate.service;

import java.math.BigDecimal;
import java.util.List;

import com.pirate.bean.Customer;
import com.pirate.bean.Wallet;
import com.pirate.repo.RepositoryImpl;

public class WalletService implements WalletServiceImpl {
	RepositoryImpl repo;
	
	public WalletService(RepositoryImpl repo) {
		super();
		this.repo = repo;
	}
	
	/* (non-Javadoc)
	 * @see com.pirate.service.WalletServiceImpl#createAccount(java.lang.String, java.lang.String, int, java.math.BigDecimal)
	 */
	@Override
	public Customer createAccount(String name, String mobile, int walletId, BigDecimal balance) {
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		customer.setName(name);
		customer.setMobile(mobile);
		wallet.setWalletId(walletId);
		wallet.setBalance(balance);
		customer.setWallet(wallet);
		repo.save(customer);
		return customer;
	}
	
	/* (non-Javadoc)
	 * @see com.pirate.service.WalletServiceImpl#showByName(java.lang.String)
	 */
	@Override
	public List<Customer> showByName(String name) {
		return repo.showByName(name);
	}
}
