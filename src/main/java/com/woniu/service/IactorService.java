package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.actor;
import com.woniu.pojo.actorExample;

public interface IactorService {
	void save(actor obj);
	void update(actor obj);
	void delete(Integer no);
	actor findOne(Integer no);
	List<actor> findAll(actorExample example);
	List<actor> findbyquery(PageBean<actor> pageBean,actorExample example);
	Integer countAll();
	//Ô¤ÁôÌõ¼þ²éÑ¯
}
