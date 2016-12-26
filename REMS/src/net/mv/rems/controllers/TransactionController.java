package net.mv.rems.controllers;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.Transaction;
import net.mv.rems.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	/*
	 * Order methods
	 */
	@RequestMapping(value ="/newOrder", method = RequestMethod.GET)
	public ModelAndView createOrderForm(){
	
		return new ModelAndView("newOrder", "command", new Transaction());
	}
	
	
	@RequestMapping(value="/addOrder", method = RequestMethod.POST)
	public String order(@ModelAttribute("command") Transaction transaction, HttpSession session, ModelMap model){
		
		model.addAttribute("equipment", transaction.getEquipment().getEquipName());
		model.addAttribute("description", transaction.getDescription());
		model.addAttribute("state", transaction.getState());
		model.addAttribute("city", transaction.getCity());
		model.addAttribute("address", transaction.getAddress());
		model.addAttribute("zipCode", transaction.getZipCode());
		model.addAttribute("returnDate", transaction.getReturnDate());
		
		Account account= (Account) session.getAttribute("account");
		transaction.setResearcher(account);
		
		transactionService.addOrder(transaction);
		
		return "home";
		
	}
	
	
	@RequestMapping(value="/displayOrderPerSupplier")
	public ModelAndView viewOrders(HttpSession session){
		 
		Account supplier= (Account) session.getAttribute("account");
		System.out.println("Id of supplier is : "+supplier.toString());
		System.out.println("before executing ooooooooooooooooooooooooooooooooooo");
		
		List<Transaction[]> orderList = transactionService.viewTransactions(supplier);
		
		//System.out.println(Arrays.toString(orderList.toArray()));
		System.out.println("after execution ppppppppppppppppppppppppppppppppppppp");
//		for(Object obj : orderList)
//			System.out.println(obj);
		ModelAndView model = new ModelAndView("displayOrderPerSupplier");
		model.addObject("myOrders", orderList);
		
		
		return model;
		
	}
	
	

}
