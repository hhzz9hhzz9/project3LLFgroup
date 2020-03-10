package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.speakerMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.speaker;
import com.woniu.pojo.speakerExample;
//import com.woniu.pojo.speakerExample.Criteria;
import com.woniu.service.IspeakerService;

@Service
@Transactional
public class speakerServiceImpl implements IspeakerService {
	@Autowired
	speakerMapper speakerMapper;

	@Override
	public void save(speaker obj) {
		speakerMapper.insert(obj);
	}

	@Override
	public void update(speaker obj) {
		speakerMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		speakerMapper.deleteByPrimaryKey(no);
	}

	@Override
	public speaker findOne(Integer no) {
		return speakerMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<speaker> findAll(speakerExample example) {
		return speakerMapper.selectByExample(example);
	}

	@Override
	public List<speaker> findbyquery(PageBean<speaker> pageBean,speakerExample example) {
		// TODO Auto-generated method stub
//		speakerExample example = new speakerExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage() - 1) * pageBean.getPageRow());
		return speakerMapper.selectByExample(example);
	}

	@Override
	public Integer countAll(speakerExample example) {
		// TODO Auto-generated method stub
		Long countRows = speakerMapper.countByExample(example);
		Integer countRow = countRows.intValue();
		return countRow;
	}
}
