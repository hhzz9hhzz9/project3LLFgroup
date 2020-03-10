package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.filmMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.film;
import com.woniu.pojo.filmExample;
//import com.woniu.pojo.filmExample.Criteria;
import com.woniu.service.IfilmService;

@Service
@Transactional
public class filmServiceImpl implements IfilmService {
	@Autowired
	filmMapper filmMapper;

	@Override
	public void save(film obj) {
		filmMapper.insert(obj);
	}

	@Override
	public void update(film obj) {
		filmMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		filmMapper.deleteByPrimaryKey(no);
	}

	@Override
	public film findOne(Integer no) {
		return filmMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<film> findAll(filmExample example) {
		return filmMapper.selectByExample(example);
	}

	@Override
	public List<film> findbyquery(PageBean<film> pageBean, String filmname, List<Integer> filmIds,Integer areaid,Integer yearid) {
		// TODO Auto-generated method stub
		filmExample example = new filmExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage() - 1) * pageBean.getPageRow());
		com.woniu.pojo.filmExample.Criteria criteria = example.createCriteria();
		//名称模糊查询
		if (filmname != null && !filmname.equals("")) {
			criteria.andFilmNameLike("%" + filmname + "%");
		}
		//按照区域id
		if (areaid != null) {
			criteria.andAreaIdEqualTo(areaid);
		}
		//按照年份id
		if (yearid != null) {
			criteria.andYearIdEqualTo(yearid);
		}
		// 按照传过来的电影id集合查询
		if (filmIds != null) {
			criteria.andAreaIdIn(filmIds);
		}

		return filmMapper.selectByExample(example);
	}

	@Override
	public Integer countAll(String filmname, List<Integer> filmIds,Integer areaid,Integer yearid) {
		// TODO Auto-generated method stub
		filmExample example = new filmExample();
		com.woniu.pojo.filmExample.Criteria criteria = example.createCriteria();
		//名称模糊查询
				if (filmname != null && !filmname.equals("")) {
					criteria.andFilmNameLike("%" + filmname + "%");
				}
				//按照区域id
				if (areaid != null) {
					criteria.andAreaIdEqualTo(areaid);
				}
				//按照年份id
				if (yearid != null) {
					criteria.andYearIdEqualTo(yearid);
				}
				// 按照传过来的电影id集合查询
				if (filmIds != null) {
					criteria.andAreaIdIn(filmIds);
				}
		Long countRows = filmMapper.countByExample(example);
		Integer countRow = countRows.intValue();
		return countRow;
	}
}
