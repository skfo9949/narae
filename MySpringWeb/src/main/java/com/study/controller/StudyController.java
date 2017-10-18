package com.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  StudyController {
	//class가  아니라 메서드와 매핑된다.
	@RequestMapping("/study/showMessage.html")
	public String showMessage(Model model, HttpServletRequest req, HttpServletResponse res) {
		String sComboScript ="<select id='searchdate' >"
											+"<option value='all' selected=''>-select-</option>"
											+"<option value='1d'> 1일</option>"
											+"<option value='1w'>1주</option>"
											+"<option value='1m'>1개월</option>"
											+"<option value='6m'>6개월</option>"
											+"<option value='1y'>1년</option>"
											+"</select>";
		model.addAttribute("message","Hello! Spring Web Programming");
		model.addAttribute("combo",sComboScript);
		return "showMessage";
	}
}
