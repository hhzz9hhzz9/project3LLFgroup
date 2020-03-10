package com.woniu.service;

import java.util.List;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.speaker;
import com.woniu.pojo.speakerExample;

public interface collectionsService {
	void save(speaker obj);
	void update(speaker obj);
	void delete(Integer no);
	speaker findOne(Integer no);
	List<speaker> findAll(speakerExample example);
	List<speaker> findbyquery(PageBean<speaker> pageBean,speakerExample example);
	Integer countAll(speakerExample example);
}
