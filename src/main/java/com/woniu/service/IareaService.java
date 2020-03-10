package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.area;
import com.woniu.pojo.areaExample;

public interface IareaService {
	void save(area obj);
	void update(area obj);
	void delete(Integer no);
	area findOne(Integer no);
	List<area> findAll(areaExample example);
	List<area> findbyquery(PageBean<area> pageBean,areaExample example);
	Integer countAll();
	//Ô¤ÁôÌõ¼þ²éÑ¯
}
