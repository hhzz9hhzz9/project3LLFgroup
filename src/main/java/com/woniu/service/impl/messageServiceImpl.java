package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.messageMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.message;
import com.woniu.pojo.messageExample;
//import com.woniu.pojo.messageExample.Criteria;
import com.woniu.service.ImessageService;

@Service
@Transactional
public class messageServiceImpl implements ImessageService {
	@Autowired
	messageMapper messageMapper;

	@Override
	public void save(message obj) {
		messageMapper.insert(obj);
	}

	@Override
	public void update(message obj) {
		messageMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		messageMapper.deleteByPrimaryKey(no);
	}

	@Override
	public message findOne(Integer no) {
		return messageMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<message> findAll(messageExample example) {
		return messageMapper.selectByExample(example);
	}

	@Override
	public List<message> findbyquery(PageBean<message> pageBean,messageExample example) {
		// TODO Auto-generated method stub
//		messageExample example = new messageExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage() - 1) * pageBean.getPageRow());

		return messageMapper.selectByExample(example);
	}

	@Override
	public Integer countAll(messageExample example) {
		// TODO Auto-generated method stub
		Long countRows = messageMapper.countByExample(example);
		Integer countRow = countRows.intValue();
		return countRow;
	}
}
