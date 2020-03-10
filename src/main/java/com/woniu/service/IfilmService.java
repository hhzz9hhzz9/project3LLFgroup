package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.film;
import com.woniu.pojo.filmExample;

public interface IfilmService {
	void save(film obj);
	void update(film obj);
	void delete(Integer no);
	film findOne(Integer no);
	List<film> findAll(filmExample example);
	List<film> findbyquery(PageBean<film> pageBean,String filmname,List<Integer> filmid,Integer areaid,Integer yearid);
	Integer countAll(String filmname,List<Integer> filmid,Integer areaid,Integer yearid);
}
