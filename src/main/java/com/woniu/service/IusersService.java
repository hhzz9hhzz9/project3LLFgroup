package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.users;
import com.woniu.pojo.usersExample;

public interface IusersService {
	void save(users obj);
	void update(users obj);
	void delete(Integer no);
	users findOne(Integer no);
	List<users> findAll(usersExample example);
	users login(users obj);
	List<users> findbyquery(PageBean<users> pageBean,users users);
	Integer countAll(users users);
}
