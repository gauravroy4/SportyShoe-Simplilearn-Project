package com.gaurav.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("account")
public class AccountController {
	
	@RequestMapping("/")
	public String index() {
		return "account/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, ModelMap modelMap) {
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
			session.setAttribute("username", username);
			return "account/success";
		} else {
			modelMap.put("error", "Invalid Account...!!");
			return "account/login";
		}
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:../account/";
		//return "account/login";
	}
	
}
