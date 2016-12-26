package net.mv.rems.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.AccountType;
import net.mv.rems.domain.Equipment;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sf;

	@Override
	@Transactional
	public void persistNewUser(Account account) {
		
		Session session = sf.getCurrentSession();
		AccountType type = (AccountType) session.createCriteria(AccountType.class)
				.add(Restrictions.eq("accountType", account.getAccountType().getAccountType())).uniqueResult();
		account.setAccountType(type);
		session.save(account);
		
	}

	@Override
	@Transactional
	public String checkCredential(Account account) {
		
		Session session = sf.getCurrentSession();
		
		Account accountResult = (Account) session.createCriteria(Account.class)
				.add(Restrictions.eq("username", account.getUsername()))
				.add(Restrictions.eq("password", account.getPassword())).uniqueResult();
//		if(result.isEmpty())
//			return false;
//		return true;
		if((accountResult != null))
		{
			
			//Session session2 = sf.getCurrentSession();
			//AccountType type = (AccountType) session2.createCriteria(AccountType.class).add(Restrictions.eq("id", typeId));
			return accountResult.getAccountType().getAccountType();
		}
		else
			return "";
	}

	

}
