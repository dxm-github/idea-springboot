package com.dxm.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	//git test开发人员11111

	
	@RequestMapping("/login.do")
	public String login(String username,String pwd,HttpSession session) {
		if("zhangsan".equals(username)&&"123".equals(pwd)) {
			session.setAttribute("user",username);
			return "redirect:main.do";
		}
		return "login";
	}
	
	@RequestMapping("/main.do")
	public String main() {
		return "main";
	}
}
