package net.mv.rems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.mv.rems.dao.UserDao;
import net.mv.rems.domain.Account;
import net.mv.rems.domain.AccountType;
import net.mv.rems.domain.Equipment;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public void registerUser(Account account) {
		
		userDao.persistNewUser(account);
	}

	@Override
	public String validateLogin(Account account) {
		
		return userDao.checkCredential(account);
	}

	
}
