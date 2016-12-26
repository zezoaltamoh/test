package net.mv.rems.controllers;

import net.mv.rems.domain.Equipment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class TestController {

	@RequestMapping(value="/goTest", method=(RequestMethod.GET))
	public String goTest(){
		return "test";
	}
	
	@RequestMapping(value="/goTest2", method=(RequestMethod.GET))
	public String goTest2(){
		return "test2";
	}
}
