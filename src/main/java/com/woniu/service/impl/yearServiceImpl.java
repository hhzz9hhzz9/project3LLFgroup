package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.yearMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.yearExample;
import com.woniu.pojo.year;
import com.woniu.pojo.yearExample;
import com.woniu.pojo.yearExample.Criteria;
//import com.woniu.pojo.yearExample.Criteria;
import com.woniu.service.IyearService;

@Service
@Transactional
public class yearServiceImpl implements IyearService {
	@Autowired
	yearMapper yearMapper;

	@Override
	public void save(year obj) {
		yearMapper.insert(obj);
	}

	@Override
	public void update(year obj) {
		yearMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		yearMapper.deleteByPrimaryKey(no);
	}

	@Override
	public year findOne(Integer no) {
		return yearMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<year> findAll(yearExample example) {
		return yearMapper.selectByExample(null);
	}

//	@Override
//	public List<year> findAll(Integer yid) {
//		yearExample example=new yearExample();
//		com.woniu.pojo.yearExample.Criteria criteria = example.createCriteria();
//		criteria.andYearIdEqualTo(yid);
//		return yearMapper.selectByExample(example);
//	}
	@Override
	public List<year> findbyquery(PageBean<year> pageBean,yearExample example) {
		// TODO Auto-generated method stub
//		yearExample example = new yearExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage()-1)*pageBean.getPageRow());

		return yearMapper.selectByExample(example);
	}

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		Long countRows= yearMapper.countByExample(null);
		Integer countRow=countRows.intValue();
		return countRow;
	}
}
