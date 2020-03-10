package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.admin;
import com.woniu.pojo.adminExample;

public interface IadminService {
	void save(admin obj);
	void update(admin obj);
	void delete(Integer no);
	admin findOne(Integer no);
	List<admin> findAll(adminExample example);
	admin login(admin obj);
	List<admin> findbyquery(PageBean<admin> pageBean,admin admin);
	Integer countAll(admin admin);
}
