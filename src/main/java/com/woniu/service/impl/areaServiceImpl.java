package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.areaMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.area;
import com.woniu.pojo.areaExample;
import com.woniu.pojo.areaExample;
import com.woniu.pojo.areaExample.Criteria;
//import com.woniu.pojo.areaExample.Criteria;
import com.woniu.service.IareaService;

@Service
@Transactional
public class areaServiceImpl implements IareaService {
	@Autowired
	areaMapper areaMapper;

	@Override
	public void save(area obj) {
		areaMapper.insert(obj);
	}

	@Override
	public void update(area obj) {
		areaMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		areaMapper.deleteByPrimaryKey(no);
	}

	@Override
	public area findOne(Integer no) {
		return areaMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<area> findAll(areaExample example) {
		return areaMapper.selectByExample(example);
	}
	
//	@Override
//	public List<area> findAll(Integer aid) {
//		areaExample example=new areaExample();
//		com.woniu.pojo.areaExample.Criteria criteria = example.createCriteria();
//		criteria.andAreaIdEqualTo(aid);
//		return areaMapper.selectByExample(example);
//	}

	@Override
	public List<area> findbyquery(PageBean<area> pageBean,areaExample example) {
		// TODO Auto-generated method stub
//		areaExample example = new areaExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage()-1)*pageBean.getPageRow());

		return areaMapper.selectByExample(example);
	}

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		Long countRows= areaMapper.countByExample(null);
		Integer countRow=countRows.intValue();
		return countRow;
	}
}
