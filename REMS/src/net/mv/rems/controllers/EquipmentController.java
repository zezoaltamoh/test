package net.mv.rems.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import net.mv.rems.domain.Account;
import net.mv.rems.domain.Equipment;
import net.mv.rems.service.EquipmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EquipmentController {
	
	@Autowired
	EquipmentService equipmentService;

	/*
	 * Adding new equipments methods
	 */
	@RequestMapping(value="/addEquipment", method = RequestMethod.GET)
	public ModelAndView createAddEquipmentForm(){
		
		return new ModelAndView("addEquipment", "command", new Equipment());
	}
	
	
	@RequestMapping(value="/newEquipment", method= RequestMethod.POST)
	public String addEquipment(@ModelAttribute("command") Equipment equipment, HttpSession session, ModelMap model){
		
		model.addAttribute("equipName", equipment.getEquipName());
		model.addAttribute("quantity", equipment.getQuantity());
		model.addAttribute("price", equipment.getPrice());
		model.addAttribute("condition", equipment.getCondition());
		model.addAttribute("status", equipment.getStatus());
		
		Account account = (Account) session.getAttribute("account");
		equipment.setAccount(account);
		
		model.addAttribute("category", equipment.getCategory().getCategName());
		
		equipmentService.addEquipment(equipment);
		
		return "home";
	}
	
	
	@RequestMapping(value="/displayEquipments")
	public ModelAndView displayEquipment(){
		
		List<Equipment> equipmentList = equipmentService.displayEquipments();
		
		ModelAndView model = new ModelAndView("displayEquipments");
		model.addObject("AvailableEquipment", equipmentList);
		
		return model;
		
	}
	
}
