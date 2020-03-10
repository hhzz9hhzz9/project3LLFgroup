package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.director;
import com.woniu.pojo.directorExample;

public interface IdirectorService {
	void save(director obj);
	void update(director obj);
	void delete(Integer no);
	director findOne(Integer no);
	List<director> findAll(directorExample example);
	List<director> findbyquery(PageBean<director> pageBean,directorExample example);
	Integer countAll();
	//Ô¤ÁôÌõ¼þ²éÑ¯
}
