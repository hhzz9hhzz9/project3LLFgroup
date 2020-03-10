package com.woniu.mapper;

import com.woniu.pojo.director;
import com.woniu.pojo.directorExample;
import java.util.List;

public interface directorMapper {
    long countByExample(directorExample example);

    int deleteByPrimaryKey(Integer directorId);

    int insert(director record);

    int insertSelective(director record);

    List<director> selectByExample(directorExample example);

    director selectByPrimaryKey(Integer directorId);

    int updateByPrimaryKeySelective(director record);

    int updateByPrimaryKey(director record);
}