package com.woniu.service;

import java.util.List;

import com.woniu.pojo.film_actor;
import com.woniu.pojo.film_actorExample;

public interface Ifilm_actorService {
	void save(film_actor obj);
	void update(film_actor obj);
	void delete(Integer no);
	film_actor findOne(Integer no);
	List<film_actor> findAll(film_actorExample example);
	//��������id��ѯ
	List<film_actor> findAll2(Integer cid);
	//Ԥ������������ѯ
}
