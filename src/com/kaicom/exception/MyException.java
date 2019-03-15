package com.kaicom.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse res, Object obj,
			Exception e) {
		ModelAndView mav = new ModelAndView();
		if(e instanceof SelfException){
			//预期异常
			SelfException ex = (SelfException)e;
			mav.addObject("msg", ex.getMsg());
		}else{
			mav.addObject("msg", "未知异常");
			e.printStackTrace();
		}
		mav.setViewName("error");
		return mav;
	}
}
