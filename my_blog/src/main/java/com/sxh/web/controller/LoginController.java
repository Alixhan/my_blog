package com.sxh.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.sxh.config.ParamProperties;
import com.sxh.web.entity.User;
import com.sxh.web.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private ParamProperties param;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	String index() {
		return"redirect:/html/login_index.html"; //返回static静态页面
	}
	
	@RequestMapping("/login")
	String login(Model model) {
		String sdf = param.getField01();
		Page<User> page = userService.findPage(new User());
		model.addAttribute("page",page);
		return "login";
	}

}
