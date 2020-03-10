package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.film_catsMapper;
import com.woniu.pojo.film_cats;
import com.woniu.pojo.film_catsExample;
import com.woniu.pojo.film_catsExample.Criteria;
import com.woniu.service.Ifilm_catsService;

@Service
@Transactional
public class film_catsServiceImpl implements Ifilm_catsService {
	@Autowired
	film_catsMapper film_catsMapper;

	@Override
	public void save(film_cats obj) {
		film_catsMapper.insert(obj);
	}

	@Override
	public void update(film_cats obj) {
		film_catsMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		film_catsMapper.deleteByPrimaryKey(no);
	}

	@Override
	public film_cats findOne(Integer no) {
		return film_catsMapper.selectByPrimaryKey(no);
	}
	
	@Override
	public List<film_cats> findAll(film_catsExample example) {
		// TODO Auto-generated method stub
		return film_catsMapper.selectByExample(example);
	}

	@Override
	public List<film_cats> findAll2(Integer cid) {
		film_catsExample example=new film_catsExample();
		com.woniu.pojo.film_catsExample.Criteria criteria = example.createCriteria();
		criteria.andCatIdEqualTo(cid);
		return film_catsMapper.selectByExample(example);
	}
}
