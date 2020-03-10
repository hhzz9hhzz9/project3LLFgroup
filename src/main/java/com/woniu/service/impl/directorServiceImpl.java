package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.directorMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.areaExample;
import com.woniu.pojo.director;
import com.woniu.pojo.directorExample;
import com.woniu.pojo.directorExample.Criteria;
//import com.woniu.pojo.directorExample.Criteria;
import com.woniu.service.IdirectorService;

@Service
@Transactional
public class directorServiceImpl implements IdirectorService {
	@Autowired
	directorMapper directorMapper;

	@Override
	public void save(director obj) {
		directorMapper.insert(obj);
	}

	@Override
	public void update(director obj) {
		directorMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		directorMapper.deleteByPrimaryKey(no);
	}

	@Override
	public director findOne(Integer no) {
		return directorMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<director> findAll(directorExample example) {
		return directorMapper.selectByExample(example);
	}
	
//	@Override
//	public List<director> findAll(Integer cid) {
//		directorExample example=new directorExample();
//		com.woniu.pojo.directorExample.Criteria criteria = example.createCriteria();
//		criteria.andCatIdEqualTo(cid);
//		return directorMapper.selectByExample(example);
//	}

	@Override
	public List<director> findbyquery(PageBean<director> pageBean,directorExample example) {
		// TODO Auto-generated method stub
//		directorExample example = new directorExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage()-1)*pageBean.getPageRow());

		return directorMapper.selectByExample(example);
	}

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		Long countRows= directorMapper.countByExample(null);
		Integer countRow=countRows.intValue();
		return countRow;
	}
}
