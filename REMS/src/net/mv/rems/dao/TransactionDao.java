package net.mv.rems.dao;

import java.util.List;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.Equipment;
import net.mv.rems.domain.Transaction;

public interface TransactionDao {
	
	public void persistOrder(Transaction transaction);
	
	public List<Transaction[]> retrieveOrders(Account supplier);
}
