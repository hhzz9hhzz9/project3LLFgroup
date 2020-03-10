package com.woniu.mapper;

import com.woniu.pojo.actor;
import com.woniu.pojo.actorExample;
import java.util.List;

public interface actorMapper {
    long countByExample(actorExample example);

    int deleteByPrimaryKey(Integer actorId);

    int insert(actor record);

    int insertSelective(actor record);

    List<actor> selectByExample(actorExample example);

    actor selectByPrimaryKey(Integer actorId);

    int updateByPrimaryKeySelective(actor record);

    int updateByPrimaryKey(actor record);
}