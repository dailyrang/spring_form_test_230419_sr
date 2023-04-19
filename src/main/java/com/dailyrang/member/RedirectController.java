package com.dailyrang.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class RedirectController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "intex";
	}
	
	@RequestMapping(value = "/member")
	public String member(HttpServletRequest request, Model model) {
		 String mid = request.getParameter("id");
		 
		 if(mid.equals("tiger")) {
			 return "redirect:mOk";
		 }
		
		return "redirect:memberNot";
	}
	
	@RequestMapping(value = "/mOk")
	public String memberOk() {
		return "memberOk";
	}
	@RequestMapping(value = "/mNot")
	public String memberNot() {
		return "memberNot";
	}
}
