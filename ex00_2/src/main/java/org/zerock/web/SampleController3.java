package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.*;

@Controller
public class SampleController3 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);

	@RequestMapping("/doD")
	public String doD(Model model) {
		ProductVO product = new ProductVO("Sample Product", 10000);
		logger.info("doD called.................");

		//model.addAttribute("productVO",product); -> 키 값을 생략할 수 있음.
		model.addAttribute(product);

		return "productDetail"; // /WEB-INF/views/productDetail.jsp
	}
}
