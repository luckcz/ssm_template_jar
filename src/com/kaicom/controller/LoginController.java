package com.kaicom.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kaicom.exception.SelfException;
import com.kaicom.service.IUserService;
import com.kaicom.vo.QueryVo;

@Controller
@RequestMapping(value = "/springmvc",produces = "application/json;charset=utf-8")
public class LoginController {
	@Resource
	private IUserService iUserService ;
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("userName") String userName ,@RequestParam("password") String password,HttpSession session){
		ModelAndView mav = new ModelAndView();
		String message = iUserService.login(userName, password);
		if(message.equals("success")){
			mav.setViewName("welcome");
			mav.addObject("userName", userName);
			session.setAttribute("LOGIN_USER", userName);
		}else{
			mav.addObject("message", message);
			mav.setViewName("redirect:/login.jsp");
		}
		return mav ;
	}
	
	@RequestMapping("/testTran")
	public ModelAndView testTran(Date ctime) throws SelfException{
		System.out.println(ctime.toLocaleString());
		ModelAndView mav = new ModelAndView();
		String message = iUserService.testTran();
		mav.setViewName("welcome");
		mav.addObject("userName", "张三");
		return mav ;
	}
	
	@RequestMapping("/test")
	public String testTran(QueryVo vo){
		System.out.println(vo);
		return "error" ;
	}
	
	@RequestMapping("/picture")
	@ResponseBody
	public String upload(MultipartFile file) throws Exception{
		//重新命名文件名
		String fileName = UUID.randomUUID().toString().replaceAll("-", "");
		String originalFilename = file.getOriginalFilename();
		String extension = FilenameUtils.getExtension(originalFilename);
		file.transferTo(new File("D:\\file\\"+fileName+"."+extension));
		return "http://localhost:9999/pic/"+fileName+"."+extension;
	}
}
