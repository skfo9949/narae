package com.study.common.util;

public class CommonUtil {
	public static String getSelect(){
		String sComboScript = "<select id='searchdate' >"
				+"<option value='all' selected=''> -select-</option>"
				+"<option value='1d'>1일</option>"
				+"<option value='1w'>1주</option>"
				+"<option value='1m'>1개월</option>"
				+"<option value='6m'>6개월</option>"
				+"<option value='ly'>1년</option>"
				+"</select>";
		
		return sComboScript;
	}
}
