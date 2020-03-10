package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.usersMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.users;
import com.woniu.pojo.usersExample;
import com.woniu.pojo.usersExample.Criteria;
//import com.woniu.pojo.usersExample.Criteria;
import com.woniu.service.IusersService;

@Service
@Transactional
public class usersServiceImpl implements IusersService {
	@Autowired
	usersMapper usersMapper;

	@Override
	public void save(users obj) {
		usersMapper.insert(obj);
	}

	@Override
	public void update(users obj) {
		usersMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		usersMapper.deleteByPrimaryKey(no);
	}

	@Override
	public users findOne(Integer no) {
		return usersMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<users> findAll(usersExample example) {
		return usersMapper.selectByExample(example);
	}

	@Override
	public users login(users obj) {
		// TODO Auto-generated method stub
		usersExample example = new usersExample();
		com.woniu.pojo.usersExample.Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(obj.getUserName());
		criteria.andUserPwdEqualTo(obj.getUserPwd());
		List<users> userss = usersMapper.selectByExample(example);
//		System.out.println("====================================>??????????"+userss);
		return userss.get(0);
	}

	@Override
	public List<users> findbyquery(PageBean<users> pageBean, users users) {
		// TODO Auto-generated method stub
		usersExample example = new usersExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage()-1)*pageBean.getPageRow());
		if (users != null) {
			com.woniu.pojo.usersExample.Criteria criteria = example.createCriteria();
			if (users.getUserName() != null && !users.getUserName().equals("")) {
				criteria.andUserNameLike("%" + users.getUserName() + "%");
			}
			if (users.getNickName() != null && !users.getNickName().equals("")) {
				criteria.andNickNameLike("%" + users.getNickName() + "%");
			}
			if (users.getBirthday() != null && !users.getBirthday().equals("")) {
				criteria.andBirthdayEqualTo(users.getBirthday());
			}
			if (users.getEmail() != null && !users.getEmail().equals("")) {
				criteria.andEmailLike("%" + users.getEmail() + "%");
			}
			if (users.getUserPhone() != null && !users.getUserPhone().equals("")) {
				criteria.andUserPhoneLike("%" + users.getUserPhone() + "%");
			}
		}

		return usersMapper.selectByExample(example);
	}

	@Override
	public Integer countAll(users users) {
		// TODO Auto-generated method stub
		usersExample example = new usersExample();
		if (users != null) {
			com.woniu.pojo.usersExample.Criteria criteria = example.createCriteria();
			if (users.getUserName() != null && !users.getUserName().equals("")) {
				criteria.andUserNameLike("%" + users.getUserName() + "%");
			}
			if (users.getNickName() != null && !users.getNickName().equals("")) {
				criteria.andNickNameLike("%" + users.getNickName() + "%");
			}
			if (users.getBirthday() != null && !users.getBirthday().equals("")) {
				criteria.andBirthdayEqualTo(users.getBirthday());
			}
			if (users.getEmail() != null && !users.getEmail().equals("")) {
				criteria.andEmailLike("%" + users.getEmail() + "%");
			}
			if (users.getUserPhone() != null && !users.getUserPhone().equals("")) {
				criteria.andUserPhoneLike("%" + users.getUserPhone() + "%");
			}
		}
		Long countRows= usersMapper.countByExample(example);
		Integer countRow=countRows.intValue();
		return countRow;
	}
}
