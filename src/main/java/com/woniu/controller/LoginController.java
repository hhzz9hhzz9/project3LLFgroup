package com.woniu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.frontMessage;
import com.woniu.pojo.admin;
import com.woniu.service.IadminService;

//@RequestMapping("dept")
@Controller
public class LoginController {
	@Autowired
	IadminService adminService;

	@ResponseBody
	@RequestMapping("backloginAjax")
	public Object loginAjax(admin admin, HttpSession session) {
		frontMessage message = new frontMessage();
		admin Loginadmin = adminService.login(admin);
		System.out.println(Loginadmin+"--------------------");
		if (Loginadmin != null) {
			message.setFlag(true);
		} else {
			message.setFlag(false);
		}
		System.out.println(message);
		return message;
	}

	@RequestMapping("backlogout")
	public String logout(HttpSession session) {
		// 登录用户退出登录 session.removeAttribute("loginUser");移除session中的某个数据
		// session.removeAttribute("loginUser");
		// 清除session中的所有数据
		session.invalidate();
		return "redirect:backlogin";
	}

	@RequestMapping("backlogin")
	public String login() {
		return "backlogin";
	}
}
