package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController5 {
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() { //@ResponseBody 어노테이션이 적용되어 있으므로 결과적으로 HTTP 요청 몸체 데이터가 HTTP 응답 몸체로 전송된다.

		ProductVO vo = new ProductVO("샘플상품", 30000);

		return vo;

	}
}
