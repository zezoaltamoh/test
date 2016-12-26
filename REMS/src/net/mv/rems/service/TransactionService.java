package net.mv.rems.service;

import java.util.List;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.Equipment;
import net.mv.rems.domain.Transaction;

public interface TransactionService {
	
	public void addOrder(Transaction transaction);
	
	public List<Transaction[]> viewTransactions(Account supplier);

}
