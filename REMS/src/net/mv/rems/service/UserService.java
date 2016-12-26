package net.mv.rems.service;

import java.util.List;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.AccountType;
import net.mv.rems.domain.Equipment;

public interface UserService {
	
	public void registerUser(Account account);
	
	public String validateLogin(Account account);
	

}
