package com.ltts.ConnectedBoatSimulatorUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.ConnectedBoatSimulatorUI.model.Boatengine;
import com.ltts.ConnectedBoatSimulatorUI.model.Boatsensor;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatengineService;
import com.ltts.ConnectedBoatSimulatorUI.service.BoatsensorService;

@Controller
public class BoatsensorController {
	@Autowired
	private BoatsensorService service8;
	
	@GetMapping("/boatsensorlist")
	public String viewEngine(Model model) {
		List<Boatsensor> li	 = service8.getAllBoatsensor();
		model.addAttribute("boatsensorlist", li);
		return "boatsensorlist";
	}
	

}