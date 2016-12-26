package net.mv.rems.dao;

import java.util.List;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.AccountType;
import net.mv.rems.domain.Equipment;

public interface UserDao {
	
	public void persistNewUser(Account account);
	
	public String checkCredential(Account account);


}
