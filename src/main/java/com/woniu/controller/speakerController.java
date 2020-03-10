package com.woniu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.frontMessage;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.speaker;
import com.woniu.pojo.speakerExample;
import com.woniu.service.IspeakerService;
import com.woniu.service.IusersService;
@Controller
public class speakerController {
	@Autowired
	IspeakerService speakerService;

	@RequestMapping("findAll3")
	@ResponseBody
	public frontMessage findAll3(PageBean<speaker> pageBean,Integer filmId,Integer usersid) {
		//前端传回来页面信息,以及其他条件进行处理
		System.out.println("speakerController.findAll3()========");
		frontMessage message = new frontMessage();
		speakerExample example=new speakerExample();
		//根据前端传回来的用户id来查找
		
		//根据前端传回来的电影id来查找
		
		//前端传回来条件，加上时间顺序和逆序条件
		
		//前端传回来条件，加上评分顺序和逆序条件
		
		//前端传回来评分（1-10），进行评分筛选
		
		
		try {
			if (pageBean.getNowPage() == null) {
				pageBean.setNowPage(1);
			}
			pageBean.setPageRow(5);
			// 总行数
			int countRow = speakerService.countAll(example);
			pageBean.setCountRow(countRow);
			int countPage = pageBean.getCountRow() % pageBean.getPageRow() == 0
					? pageBean.getCountRow() / pageBean.getPageRow()
					: pageBean.getCountRow() / pageBean.getPageRow() + 1;
			pageBean.setCountPage(countPage);
			List<speaker> userList = speakerService.findbyquery(pageBean,example);
			pageBean.setList(userList);
			message.setFlag(true);
		} catch (Exception e) {
			message.setFlag(false);
		}
		message.setObj1(pageBean);
		return message;
	}

	@RequestMapping("addSpeakers")
	@ResponseBody
	public String addSpeakers(speaker speaker) {
		System.out.println("speakerController.addSpeakers()========");
		String mess = null;
		if (speaker != null && !speaker.equals("")) {
			speakerService.save(speaker);
			mess = "成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}

	@RequestMapping("findSpeakersById")
	@ResponseBody
	public speaker findSpeakersById(Integer cusid) {
		System.out.println("speakerController.findSpeakersById()========");
		speaker speaker = null;
		if (cusid != null) {
			speaker = speakerService.findOne(cusid);
		}
		return speaker;
	}

	@RequestMapping("editSpeakers")
	@ResponseBody
	public String editSpeakers(speaker speaker) {
		System.out.println("speakerController.editSpeakers()========");
		String mess = null;
		if (speaker != null && !speaker.equals("")) {
			speakerService.update(speaker);
			mess = "成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}

	@RequestMapping("delSpeakersById")
	@ResponseBody
	public String delSpeakersById(Integer cusid) {
		System.out.println("speakerController.delSpeakersById()========");
		String mess = null;
		if (cusid != null) {
			speakerService.delete(cusid);
			mess = "删除成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}
}
