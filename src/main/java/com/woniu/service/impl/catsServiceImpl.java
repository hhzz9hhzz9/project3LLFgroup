package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.catsMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.cats;
import com.woniu.pojo.catsExample;
import com.woniu.pojo.catsExample;
import com.woniu.pojo.catsExample.Criteria;
//import com.woniu.pojo.catsExample.Criteria;
import com.woniu.service.IcatsService;

@Service
@Transactional
public class catsServiceImpl implements IcatsService {
	@Autowired
	catsMapper catsMapper;

	@Override
	public void save(cats obj) {
		catsMapper.insert(obj);
	}

	@Override
	public void update(cats obj) {
		catsMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		catsMapper.deleteByPrimaryKey(no);
	}

	@Override
	public cats findOne(Integer no) {
		return catsMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<cats> findAll(catsExample example) {
		return catsMapper.selectByExample(example);
	}
	
//	@Override
//	public List<cats> findAll(Integer cid) {
//		catsExample example=new catsExample();
//		com.woniu.pojo.catsExample.Criteria criteria = example.createCriteria();
//		criteria.andCatIdEqualTo(cid);
//		return catsMapper.selectByExample(example);
//	}

	@Override
	public List<cats> findbyquery(PageBean<cats> pageBean,catsExample example) {
		// TODO Auto-generated method stub
//		catsExample example = new catsExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage()-1)*pageBean.getPageRow());

		return catsMapper.selectByExample(example);
	}

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		Long countRows= catsMapper.countByExample(null);
		Integer countRow=countRows.intValue();
		return countRow;
	}
}
