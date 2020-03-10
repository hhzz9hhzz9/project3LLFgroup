package com.woniu.mapper;

import com.woniu.pojo.users;
import com.woniu.pojo.usersExample;
import java.util.List;

public interface usersMapper {
    long countByExample(usersExample example);

	int deleteByPrimaryKey(Integer userId);

	int insert(users record);

	int insertSelective(users record);

	List<users> selectByExample(usersExample example);

	users selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(users record);

	int updateByPrimaryKey(users record);
}