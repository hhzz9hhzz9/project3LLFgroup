package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.film_actorMapper;
import com.woniu.pojo.actorExample;
import com.woniu.pojo.film_actor;
import com.woniu.pojo.film_actorExample;
import com.woniu.pojo.film_actorExample.Criteria;
import com.woniu.service.Ifilm_actorService;

@Service
@Transactional
public class film_actorServiceImpl implements Ifilm_actorService {
	@Autowired
	film_actorMapper film_actorMapper;

	@Override
	public void save(film_actor obj) {
		film_actorMapper.insert(obj);
	}

	@Override
	public void update(film_actor obj) {
		film_actorMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		film_actorMapper.deleteByPrimaryKey(no);
	}

	@Override
	public film_actor findOne(Integer no) {
		return film_actorMapper.selectByPrimaryKey(no);
	}
	
	@Override
	public List<film_actor> findAll(film_actorExample example) {
		// TODO Auto-generated method stub
		return film_actorMapper.selectByExample(example);
	}

	@Override
	public List<film_actor> findAll2(Integer cid) {
		film_actorExample example=new film_actorExample();
		com.woniu.pojo.film_actorExample.Criteria criteria = example.createCriteria();
		criteria.andActorIdEqualTo(cid);
		return film_actorMapper.selectByExample(example);
	}
}
