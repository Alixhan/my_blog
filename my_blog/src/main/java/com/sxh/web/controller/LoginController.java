package com.sxh.web.controller;

import com.github.pagehelper.Page;
import com.sxh.web.entity.User;
import com.sxh.web.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/index")
	String index() {
		return"redirect:/html/login_index.html"; //返回static静态页面
	}
	
	@RequestMapping("/login")
	String login(Model model) {
		Page<User> page = userService.findPage(new User());
		model.addAttribute("page",page);
		return "login";
	}

}
