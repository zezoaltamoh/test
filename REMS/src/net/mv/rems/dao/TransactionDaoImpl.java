package net.mv.rems.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.Equipment;
import net.mv.rems.domain.Transaction;

@Repository
public class TransactionDaoImpl implements TransactionDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	@Transactional
	public void persistOrder(Transaction transaction) {
		
		Session session = sf.getCurrentSession();
		
		Account researcher = (Account) session.createCriteria(Account.class)
				.add(Restrictions.eq("username", transaction.getResearcher().getUsername())).uniqueResult();
		
		transaction.setResearcher(researcher);
		
		
		Equipment equipment = (Equipment) session.createCriteria(Equipment.class)
				.add(Restrictions.eq("equipName", transaction.getEquipment().getEquipName())).uniqueResult();
		
		transaction.setEquipment(equipment);
		
		//Query query = session.createQuery("SELECT account.id FROM Account, a WHERE  = :CustName");
		
		//query.setString("CustName", customer.getUsername());
		
		session.save(transaction);
	}

	
	@Override
	@Transactional
	public List<Transaction[]> retrieveOrders(Account supplier) {
		
		
	
//		Query query = session.createQuery("SELECT id FROM Account WHERE username = :CustName");
//		query.setString("CustName", supplier.getUsername());
//		
//		List<Long> list = query.list();
//		supplier.setId(list.get(0));
		
		
//		Equipment equipment = session.createCriteria(Equipment.class)
//		.add(Restrictions.eq("account", transaction.get))
		
//		List<Transaction> result = (List<Transaction>) session.createCriteria(Transaction.class)
//		.add(Restrictions.eq("equipment", transaction.getEquipment().getAccount())).uniqueResult();
		
		
//		Session session2 = sf.getCurrentSession();
//		return session2.createCriteria(Transaction.class)
//				.add(Restrictions.eq("equipment.id",supplier.getId())).list();
		
		/*Session session = sf.getCurrentSession();
		Criteria criteria = session.createCriteria(Account.class, "supplier");
		
		criteria.createAlias("supplier.supplierTransactionsList", "equipment");
		criteria.createAlias("equipment.transactions", "transaction");
		
		criteria.add(Restrictions.eqProperty("supplier.id", "equipment.account.id"));
		criteria.add(Restrictions.eqProperty("transaction.equipment.id", "equipment.id"));
		criteria.add(Restrictions.eq("supplier.id", supplier.getId()));
		return criteria.list();*/
		
//		return session.createSQLQuery("select T.* from Transaction T join Equipment E on "
//				+ "E.Equipment_ID = T.Equipment_ID "
//				+ "join Account A on A.Account_ID = T.RESEARCHER_ID where A.Account_ID = "
//				+ "(select A.Account_ID from Account A where A.username = '"+supplier.getUsername()+"')").list();
		
	
			/*Session session = sf.getCurrentSession();
			Query query = session.createSQLQuery("select T.* from Transaction T join Equipment E on "
				+ "E.Equipment_ID = T.Equipment_ID "
				+ "join Account A on A.Account_ID = T.RESEARCHER_ID where A.username = :CustName");
			System.out.println("the username value is :"+ supplier.getUsername());
			query.setString("CustName", supplier.getUsername());
			List<Transaction[]> result = query.list();
			
			return result;*/
		
		Session session = sf.getCurrentSession();
		Query query = session.createQuery("select T from Transaction T join T.equipment E join E.account A where A.username = :CustName");
		//System.out.println("the username value is :"+ supplier.getUsername());
		query.setString("CustName", supplier.getUsername());
		List<Transaction[]> result = query.list();
		return result;
		
	}

	
	
	
	
	

}
