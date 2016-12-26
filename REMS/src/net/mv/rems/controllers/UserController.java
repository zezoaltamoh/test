package net.mv.rems.controllers;

import javax.servlet.http.HttpServletRequest;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.AccountType;
import net.mv.rems.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	/*
	 * Login method
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView createLoginForm(){
		
		return new ModelAndView("login", "command", new Account());
	}
	
	@RequestMapping(value="/loginUser", method= {RequestMethod.POST, RequestMethod.GET})
	public String login(@ModelAttribute("command") Account account, HttpServletRequest request, ModelMap model){
		
		model.addAttribute("username", account.getUsername());
		model.addAttribute("password", account.getPassword());
		
		String result = userService.validateLogin(account);
		
		
		request.getSession().setAttribute("account", account);
			
		switch(result){
		
		case "supplier":
			return "homeSupplier";
		case "admin":
			return "homeAdmin";
		case "researcher":
			return "home";
		default:
			return "login";
		}

	}
	
	@RequestMapping(value="/goHome", method=(RequestMethod.GET))
	public String goHome(){
		return "home";
	}
	
	
	/*
	 * Registration methods 
	 */
	@RequestMapping(value ="/register", method = RequestMethod.GET)
	public ModelAndView createRegisterationForm(){
	
		return new ModelAndView("register", "command", new Account());
	}
	
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("command") Account account,  ModelMap model){
		
		
		model.addAttribute("fName", account.getfName());
		model.addAttribute("lName", account.getlName());
		model.addAttribute("username", account.getUsername());
		model.addAttribute("password", account.getPassword());
		model.addAttribute("email", account.getEmail());
		model.addAttribute("address", account.getAddress());
		model.addAttribute("state", account.getState());
		model.addAttribute("city", account.getCity());
		model.addAttribute("zipCode", account.getZipCode());
		model.addAttribute("phoneNum", account.getPhoneNum());
		
		model.addAttribute("accountType" , account.getAccountType().getAccountType());
		
		userService.registerUser(account);
		
		return "login";
		
	}
	
}
