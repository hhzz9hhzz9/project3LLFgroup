package com.woniu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.frontMessage;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.film;
import com.woniu.pojo.film_cats;
import com.woniu.service.IfilmService;
import com.woniu.service.Ifilm_catsService;
@Controller
public class filmController {
	@Autowired
	IfilmService filmService;
	@Autowired
	Ifilm_catsService film_catsService;

	@RequestMapping("findAllFilm")
	@ResponseBody
	public frontMessage findAll3(PageBean<film> pageBean, String filmname,Integer areaid,Integer yearid,Integer catsid) {
		//前端传回来页面信息，电影名称（模糊查询），电影区域id,电影年份id,电影种类id
		System.out.println("filmController.findAll3()========");
		frontMessage message = new frontMessage();
		//根据前端传回来的类型id来查找电影id集合
		List<film_cats> film_catss=film_catsService.findAll2(catsid);
		List<Integer> filmIds=new ArrayList<Integer>();
		if(film_catss!=null) {
			for(int i=0;i<film_catss.size();i++) {
				filmIds.add(film_catss.get(i).getFilmId());
			}
		}
		try {
			if (pageBean.getNowPage() == null) {
				pageBean.setNowPage(1);
			}
			pageBean.setPageRow(5);
			// 总行数
			int countRow = filmService.countAll(filmname,filmIds,yearid,catsid);
			pageBean.setCountRow(countRow);
			int countPage = pageBean.getCountRow() % pageBean.getPageRow() == 0
					? pageBean.getCountRow() / pageBean.getPageRow()
					: pageBean.getCountRow() / pageBean.getPageRow() + 1;
			pageBean.setCountPage(countPage);
			List<film> userList = filmService.findbyquery(pageBean,filmname,filmIds,yearid,catsid);
			pageBean.setList(userList);
			message.setFlag(true);
		} catch (Exception e) {
			message.setFlag(false);
		}
		message.setObj1(pageBean);
		return message;
	}

	@RequestMapping("addFilms")
	@ResponseBody
	public String addFilms(film film) {
		System.out.println("filmController.addFilms()========");
		String mess = null;
		if (film != null && !film.equals("")) {
			filmService.save(film);
			mess = "成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}

	@RequestMapping("findFilmsById")
	@ResponseBody
	public film findFilmsById(Integer cusid) {
		System.out.println("filmController.findFilmsById()========");
		film film = null;
		if (cusid != null) {
			film = filmService.findOne(cusid);
		}
		return film;
	}

	@RequestMapping("editFilms")
	@ResponseBody
	public String editFilms(film film) {
		System.out.println("filmController.editFilms()========");
		String mess = null;
		if (film != null && !film.equals("")) {
			filmService.update(film);
			mess = "成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}

	@RequestMapping("delFilmsById")
	@ResponseBody
	public String delFilmsById(Integer cusid) {
		System.out.println("filmController.delFilmsById()========");
		String mess = null;
		if (cusid != null) {
			filmService.delete(cusid);
			mess = "删除成功！";
		} else {
			mess = "内容不能为空";
		}
		return mess;
	}
}
