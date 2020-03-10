package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.message;
import com.woniu.pojo.messageExample;

public interface ImessageService {
	void save(message obj);
	void update(message obj);
	void delete(Integer no);
	message findOne(Integer no);
	List<message> findAll(messageExample example);
	List<message> findbyquery(PageBean<message> pageBean,messageExample example);
	Integer countAll(messageExample example);
}
