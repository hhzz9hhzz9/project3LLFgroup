package com.woniu.mapper;

import com.woniu.pojo.year;
import com.woniu.pojo.yearExample;
import java.util.List;

public interface yearMapper {
    long countByExample(yearExample example);

    int deleteByPrimaryKey(Integer yearId);

    int insert(year record);

    int insertSelective(year record);

    List<year> selectByExample(yearExample example);

    year selectByPrimaryKey(Integer yearId);

    int updateByPrimaryKeySelective(year record);

    int updateByPrimaryKey(year record);
}