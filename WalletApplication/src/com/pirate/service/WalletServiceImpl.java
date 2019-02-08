package com.pirate.service;

import java.math.BigDecimal;
import java.util.List;

import com.pirate.bean.Customer;

public interface WalletServiceImpl {

	Customer createAccount(String name, String mobile, int walletId, BigDecimal balance);

	List<Customer> showByName(String name);

}