package com.gaurav.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gaurav.model.User;
import com.gaurav.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {
	
	public UserController() {
		System.out.println("ProductController()");
	}

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/")
	public String login() {
		return "user/userLogin";
	}
	
	@RequestMapping(value = "/allUser")
	public ModelAndView listUser(ModelAndView model) throws IOException {
		List<User> listUser = userService.getAllUsers();
		model.addObject("listUser", listUser);
		model.setViewName("user/userList");
		return model;
	}

	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public ModelAndView newProduct(ModelAndView model) {
		User user = new User();
		model.addObject("user", user);
		model.setViewName("user/userForm");
		return model;
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user) {
		if (user.getId() == 0) { // if Product id is 0 then creating the
			// Product otherwise updating the Product
			userService.addUser(user);
		} else {
			userService.updateUser(user);
		}
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/searchUser", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		String userEmail = request.getParameter("email");
		List<User> listUser = userService.getAllUsers();
		User user = null;
		for(User c : listUser) {
			if(userEmail == c.getEmail()) {
				user = c;
				break;
			}
		}
		
		ModelAndView model = new ModelAndView("user/userList");
		model.addObject("listUser", user);

		return model;
	}

}
