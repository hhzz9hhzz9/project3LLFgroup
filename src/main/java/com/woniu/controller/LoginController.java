package com.woniu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.frontMessage;
import com.woniu.pojo.users;
import com.woniu.service.IusersService;

//@RequestMapping("dept")
@Controller
public class LoginController {
	@Autowired
	IusersService usersService;

	@ResponseBody
	@RequestMapping("loginAjax")
	public Object loginAjax(users users, HttpSession session) {
		System.out.println("loginAjax+++++++++++++++++++" + users);
		frontMessage message = new frontMessage();
		users Loginusers = usersService.login(users);
		if (Loginusers != null) {
			message.setFlag(true);
		} else {
			message.setFlag(false);
		}
		return message;
	}

	@RequestMapping("logout")
	public String logout(HttpSession session) {
		// 登录用户退出登录 session.removeAttribute("loginUser");移除session中的某个数据
		// session.removeAttribute("loginUser");
		// 清除session中的所有数据
		session.invalidate();
		return "redirect:login";
	}

	@RequestMapping("login")
	public String login() {
		return "login";
	}
}
