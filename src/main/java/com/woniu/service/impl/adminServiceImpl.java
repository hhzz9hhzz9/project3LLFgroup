package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.adminMapper;
import com.woniu.mapper.admin_primissionMapper;
import com.woniu.mapper.primissionMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.admin;
import com.woniu.pojo.adminExample;
import com.woniu.pojo.admin_primissionExample;
import com.woniu.pojo.admin_primissionKey;
import com.woniu.pojo.primission;
import com.woniu.pojo.primissionExample;
import com.woniu.pojo.adminExample.Criteria;
//import com.woniu.pojo.adminExample.Criteria;
import com.woniu.service.IadminService;

@Service
@Transactional
public class adminServiceImpl implements IadminService {
	@Autowired
	adminMapper adminMapper;
	@Autowired
	primissionMapper primissionMapper;
	@Autowired
	admin_primissionMapper apm;

	@Override
	public void save(admin obj) {
		adminMapper.insert(obj);
	}

	@Override
	public void update(admin obj) {
		adminMapper.updateByPrimaryKey(obj);
	}

	@Override
	public void delete(Integer no) {
		adminMapper.deleteByPrimaryKey(no);
	}

	@Override
	public admin findOne(Integer no) {
		return adminMapper.selectByPrimaryKey(no);
	}

	@Override
	public List<admin> findAll(adminExample example) {
		return adminMapper.selectByExample(example);
	}

	@Override
	public admin login(admin obj) {
		// TODO Auto-generated method stub
		adminExample example = new adminExample();
		com.woniu.pojo.adminExample.Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(obj.getAccount());
		criteria.andPasswordEqualTo(obj.getPassword());
		List<admin> admins = adminMapper.selectByExample(example);
		return admins.isEmpty()?null:admins.get(0);
	}

	@Override
	public List<admin> findbyquery(PageBean<admin> pageBean, admin admin) {
		// TODO Auto-generated method stub
		adminExample example = new adminExample();
		example.setLimitSize(pageBean.getPageRow());
		example.setLimitStart((pageBean.getNowPage()-1)*pageBean.getPageRow());
		if (admin != null) {
			com.woniu.pojo.adminExample.Criteria criteria = example.createCriteria();
			if (admin.getAccount() != null && !admin.getAccount().equals("")) {
				criteria.andAccountLike("%" + admin.getAccount() + "%");
			}
		}

		return adminMapper.selectByExample(example);
	}

	@Override
	public Integer countAll(admin admin) {
		// TODO Auto-generated method stub
		adminExample example = new adminExample();
		if (admin != null) {
			com.woniu.pojo.adminExample.Criteria criteria = example.createCriteria();
			if (admin.getAccount() != null && !admin.getAccount().equals("")) {
				criteria.andAccountLike("%" + admin.getAccount() + "%");
			}
		}
		Long countRows= adminMapper.countByExample(example);
		Integer countRow=countRows.intValue();
		return countRow;
	}

	@Override
	public admin findAdminByAccount(String account) {
		admin admin = adminMapper.selectByAccount(account);
		return admin;
	}
	//传入权限编号，查询拥有该权限的管理员
	@Override
	public List<admin> findByPrimissionId(Integer pid) {
		admin_primissionExample ape = new admin_primissionExample();
		com.woniu.pojo.admin_primissionExample.Criteria apc = ape.createCriteria();
		apc.andPrimissionIdEqualTo(pid);
		List<admin_primissionKey> ap= apm.selectByExample(ape);
		List<Integer> ids = new ArrayList<Integer>();
		for (admin_primissionKey apid : ap) {
			ids.add(apid.getAdminId());
		}
		adminExample example = new adminExample();
		if (ap != null) {
			com.woniu.pojo.adminExample.Criteria criteria = example.createCriteria();
			criteria.andAdminIdIn(ids);
		}
		List<admin> admin = adminMapper.selectByExample(example);
		return admin;
	}
}
