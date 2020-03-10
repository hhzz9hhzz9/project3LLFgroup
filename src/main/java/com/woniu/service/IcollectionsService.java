package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.collections;
import com.woniu.pojo.collectionsExample;

public interface IcollectionsService {
	void save(collections obj);
	void update(collections obj);
	void delete(Integer no);
	collections findOne(Integer no);
	List<collections> findAll(collectionsExample example);
	List<collections> findbyquery(PageBean<collections> pageBean,collectionsExample example);
	Integer countAll(collectionsExample example);
}
