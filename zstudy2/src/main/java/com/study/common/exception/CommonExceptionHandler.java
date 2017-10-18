package com.study.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.study")
public class CommonExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	public String handleException() {
		return "error/commonException";
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public String handleException2() {
		return "error/commonException";
	}
}
