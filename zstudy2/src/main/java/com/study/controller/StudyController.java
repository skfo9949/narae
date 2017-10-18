package com.study.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.common.util.CommonUtil;

@Controller
public class StudyController {
	@RequestMapping("/study/showMessage.html")
	public String showMessage(Model model, HttpServletRequest req, HttpServletResponse res) {

		model.addAttribute("message", "Hello! Spring Web Programming"); // model에는 String뿐 아니라 모든것을 다 담을 수 있음.
		model.addAttribute("sserver",System.getProperty("spring.profiles.active"));
		model.addAttribute("combo",CommonUtil.getSelect());
		return "showMessage"; // view 이름.
	}
	
	@RequestMapping("/study/getMessage.html")
	public ModelAndView getMessage() {
		Map map = new HashMap();
		map.put("result", "비동기 통신 결과");
		map.put("item", "비동기 통신 아이템");
		return new ModelAndView("jsonView",map);
	}
	
	
	@RequestMapping("/common/getCodeList.html")
	public ModelAndView getCodeList(String upcd) {
		//spring은 파라미터 이름이랑 일치하면 자동으로 매핑됨. String upcd는 파라미터로 넘어온 upcd의 값을 읽는것임!(=request.getParameter("upcd");
		List<Map<String, Object>> masterList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> periodList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> gradeList = new ArrayList<Map<String, Object>>();
		Map<String,Object> result = new HashMap<String,Object>();
		
		Map map = new HashMap(); map.put("CODE", "1d"); map.put("VALUE", "1일");periodList.add(map);
		map = new HashMap(); map.put("CODE", "1w");map.put("VALUE", "1주");periodList.add(map);
		map = new HashMap(); map.put("CODE", "1m");map.put("VALUE", "1개");periodList.add(map);
		map = new HashMap(); map.put("CODE", "6m");map.put("VALUE", "6개");periodList.add(map);
		map = new HashMap(); map.put("CODE", "1y");map.put("VALUE", "1년");periodList.add(map);
		
		map = new HashMap(); map.put("CODE", "01");map.put("VALUE", "수습사원");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "02");map.put("VALUE", "사원");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "03");map.put("VALUE", "대리");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "04");map.put("VALUE", "과장");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "05");map.put("VALUE", "차장");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "06");map.put("VALUE", "부장");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "07");map.put("VALUE", "이사");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "08");map.put("VALUE", "상무");gradeList.add(map);
		map = new HashMap(); map.put("CODE", "09");map.put("VALUE", "사장");gradeList.add(map);
		
		//Maser 정보 
		map = new HashMap();map.put("CODE", "period");map.put("VALUE", "기간");masterList.add(map);
		map = new HashMap();map.put("CODE", "grade");map.put("VALUE", "직급");masterList.add(map);
		System.out.println("upcd :: "+upcd);
		if(upcd.equals("period")) {
			result.put("codeList", periodList);
		}
		else if(upcd.equals("grade")) {
			result.put("codeList", gradeList);
		}	
		else {
			result.put("codeList", masterList);
		}
		
		return new ModelAndView("jsonView", result);
	}
	
	@RequestMapping("/study/getMessageByZero.html")
	public String getMessageByZero(Model model, HttpServletRequest req, HttpServletResponse res) {
		model.addAttribute("message","Hello! Spring Web Programming"+(1/0));
		model.addAttribute("combo",CommonUtil.getSelect());
		
		return "showMessage";
	}
	
	@RequestMapping("/study/getMessage500.html")
	public String getMessage500(Model model, HttpServletRequest req, HttpServletResponse res) {
		Map map = null;
		map.get("asdf");
		
		return "showMessage";
	}
	
	@RequestMapping("/study/registForm.html")
	public String registForm(Model model, HttpServletRequest req, HttpServletResponse res) {
		return "registForm";
	}
	
	@RequestMapping("/study/doReg.html")
	public String doReg(@RequestParam Map<String, String> map, Model model, HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Parameter:"+map.toString());
		return "registOK";
	}
}
 