package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.actorExample;
import com.woniu.pojo.cats;
import com.woniu.pojo.catsExample;

public interface IcatsService {
	void save(cats obj);
	void update(cats obj);
	void delete(Integer no);
	cats findOne(Integer no);
	List<cats> findAll(catsExample example);
	List<cats> findbyquery(PageBean<cats> pageBean,catsExample example);
	Integer countAll();
	//Ô¤ÁôÌõ¼þ²éÑ¯
}
