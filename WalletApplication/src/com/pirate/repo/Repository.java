package com.pirate.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.pirate.bean.Customer;

public class Repository implements RepositoryImpl {

	Map<Integer, Customer> map = new HashMap<>();
	/* (non-Javadoc)
	 * @see com.pirate.repo.RepositoryImpl#save(com.pirate.bean.Customer)
	 */
	@Override
	public boolean save(Customer customer) {
		if(map.containsKey(customer.getWallet().getWalletId())) {
			return false;
		}
		map.put(customer.getWallet().getWalletId(),	customer);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.pirate.repo.RepositoryImpl#showByName(java.lang.String)
	 */
	@Override
	public List<Customer> showByName(String name) {
		List<Customer> list = new ArrayList<>();
		for(Entry<Integer, Customer> entry : map.entrySet()) {
			if(entry.getValue().getName().equals(name)) {
				list.add(entry.getValue());
				return list;	
			}
		}
		return null;
	}
	
}
