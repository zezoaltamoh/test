package net.mv.rems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mv.rems.dao.TransactionDao;
import net.mv.rems.domain.Account;
import net.mv.rems.domain.Equipment;
import net.mv.rems.domain.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDao transactionDao;
	
	@Override
	public void addOrder(Transaction transaction) {
		
		transactionDao.persistOrder(transaction);
		
	}

	@Override
	public List<Transaction[]> viewTransactions(Account supplier) {
		
		return transactionDao.retrieveOrders(supplier);
	}

}
