package com.woniu.mapper;

import com.woniu.pojo.message;
import com.woniu.pojo.messageExample;

import java.util.List;

public interface messageMapper {
    long countByExample(messageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(message record);

    int insertSelective(message record);

    List<message> selectByExample(messageExample example);

    message selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(message record);

    int updateByPrimaryKey(message record);
}