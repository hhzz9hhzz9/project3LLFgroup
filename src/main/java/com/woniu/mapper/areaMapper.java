package com.woniu.mapper;

import com.woniu.pojo.area;
import com.woniu.pojo.areaExample;
import java.util.List;

public interface areaMapper {
    long countByExample(areaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(area record);

    int insertSelective(area record);

    List<area> selectByExample(areaExample example);

    area selectByPrimaryKey(Integer areaId);

    int updateByPrimaryKeySelective(area record);

    int updateByPrimaryKey(area record);
}