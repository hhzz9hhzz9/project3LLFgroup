package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.actorMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.actor;
import com.woniu.pojo.actorExample;
import com.woniu.pojo.actorExample;
import com.woniu.pojo.actorExample.Criteria;
//import com.woniu.pojo.actorExample.Criteria;
import com.woniu.service.IactorService;

@Service
@Transactional
public class actorServiceImpl implements IactorService {
	@Autowired
	actorMapper actorMapper;

	@Override
	public void save(actor obj) {
		actorMapper.insert(obj);
	}

	@Override
	public void update(actor obj) {
		actorMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		actorMapper.deleteByPrimaryKey(no);
	}

	@Override
	public actor findOne(Integer no) {
		return actorMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<actor> findAll(actorExample example) {
		return actorMapper.selectByExample(example);
	}
	
//	@Override
//	public List<actor> findAll(Integer cid) {
//		actorExample example=new actorExample();
//		com.woniu.pojo.actorExample.Criteria criteria = example.createCriteria();
//		criteria.andCatIdEqualTo(cid);
//		return actorMapper.selectByExample(example);
//	}

	@Override
	public List<actor> findbyquery(PageBean<actor> pageBean,actorExample example) {
		// TODO Auto-generated method stub
//		actorExample example = new actorExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage()-1)*pageBean.getPageRow());

		return actorMapper.selectByExample(example);
	}

	@Override
	public Integer countAll() {
		// TODO Auto-generated method stub
		Long countRows= actorMapper.countByExample(null);
		Integer countRow=countRows.intValue();
		return countRow;
	}
}
