package com.woniu.mapper;

import com.woniu.pojo.admin;
import com.woniu.pojo.adminExample;
import java.util.List;

public interface adminMapper {
    long countByExample(adminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(admin record);

    int insertSelective(admin record);

    List<admin> selectByExample(adminExample example);

    admin selectByPrimaryKey(Integer adminId);
    
    admin selectByAccount(String account);

    int updateByPrimaryKeySelective(admin record);

    int updateByPrimaryKey(admin record);
}