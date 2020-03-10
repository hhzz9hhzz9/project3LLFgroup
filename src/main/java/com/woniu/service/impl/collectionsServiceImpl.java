package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.collectionsMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.collections;
import com.woniu.pojo.collectionsExample;
//import com.woniu.pojo.collectionsExample.Criteria;
import com.woniu.service.IcollectionsService;

@Service
@Transactional
public class collectionsServiceImpl implements IcollectionsService {
	@Autowired
	collectionsMapper collectionsMapper;

	@Override
	public void save(collections obj) {
		collectionsMapper.insert(obj);
	}

	@Override
	public void update(collections obj) {
		collectionsMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		collectionsMapper.deleteByPrimaryKey(no);
	}

	@Override
	public collections findOne(Integer no) {
		return collectionsMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<collections> findAll(collectionsExample example) {
		return collectionsMapper.selectByExample(example);
	}

	@Override
	public List<collections> findbyquery(PageBean<collections> pageBean,collectionsExample example) {
		// TODO Auto-generated method stub
//		collectionsExample example = new collectionsExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage() - 1) * pageBean.getPageRow());
		return collectionsMapper.selectByExample(example);
	}

	@Override
	public Integer countAll(collectionsExample example) {
		// TODO Auto-generated method stub
		Long countRows = collectionsMapper.countByExample(example);
		Integer countRow = countRows.intValue();
		return countRow;
	}
}
