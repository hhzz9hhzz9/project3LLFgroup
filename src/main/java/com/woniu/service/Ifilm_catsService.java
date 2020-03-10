package com.woniu.service;

import java.util.List;

import com.woniu.pojo.film_cats;
import com.woniu.pojo.film_catsExample;

public interface Ifilm_catsService {
	void save(film_cats obj);
	void update(film_cats obj);
	void delete(Integer no);
	film_cats findOne(Integer no);
	List<film_cats> findAll(film_catsExample example);
	//根据类型id查询
	List<film_cats> findAll2(Integer cid);
	//预留其他条件查询
}
