package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.frontMessage;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.users;
import com.woniu.service.IusersService;
@Controller
public class userController {
	@Autowired
	IusersService usersService;

	@RequestMapping("/users/findAll3")
	@ResponseBody
	public frontMessage findAll3(PageBean<users> pageBean, users users) {
		System.out.println("usersController.findAll3()========");
		frontMessage message = new frontMessage();
		try {
			if (pageBean.getNowPage() == null) {
				pageBean.setNowPage(1);
			}
			pageBean.setPageRow(5);
			// 总行数
			int countRow = usersService.countAll(users);
			pageBean.setCountRow(countRow);
			int countPage = pageBean.getCountRow() % pageBean.getPageRow() == 0
					? pageBean.getCountRow() / pageBean.getPageRow()
					: pageBean.getCountRow() / pageBean.getPageRow() + 1;
			pageBean.setCountPage(countPage);
			List<users> userList = usersService.findbyquery(pageBean, users);
			pageBean.setList(userList);
			message.setFlag(true);
		} catch (Exception e) {
			message.setFlag(false);
		}
		message.setObj1(pageBean);
		return message;
	}

	@RequestMapping("/users/addUsers")
	@ResponseBody
	public String addUsers(users users) {
		System.out.println("usersController.addUsers()========");
		String mess = null;
		if (users != null && !users.equals("")) {
			usersService.save(users);
			mess = "成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}

	@RequestMapping("/users/findUsersById")
	@ResponseBody
	public users findUsersById(Integer cusid) {
		System.out.println("usersController.findUsersById()========");
		users users = null;
		if (cusid != null) {
			users = usersService.findOne(cusid);
		}
		return users;
	}

	@RequestMapping("/users/editUsers")
	@ResponseBody
	public String editUsers(users users) {
		System.out.println("usersController.editUsers()========");
		String mess = null;
		if (users != null && !users.equals("")) {
			//设置状态为1，目前未确定代表什么
			users.setUserStatus(1);
			usersService.update(users);
			mess = "成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}

	@RequestMapping("/users/delUsersById")
	@ResponseBody
	public String delUsersById(Integer cusid) {
		System.out.println("usersController.delUsersById()========");
		String mess = null;
		if (cusid != null) {
			usersService.delete(cusid);
			mess = "删除成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}
}
