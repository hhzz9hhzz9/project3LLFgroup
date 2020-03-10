package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.year;
import com.woniu.pojo.yearExample;

public interface IyearService {
	void save(year obj);
	void update(year obj);
	void delete(Integer no);
	year findOne(Integer no);
	List<year> findAll(yearExample example);
	List<year> findbyquery(PageBean<year> pageBean,yearExample example);
	Integer countAll();
	//Ô¤ÁôÌõ¼þ²éÑ¯
}
