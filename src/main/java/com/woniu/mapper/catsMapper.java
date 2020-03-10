package com.woniu.mapper;

import com.woniu.pojo.cats;
import com.woniu.pojo.catsExample;
import java.util.List;

public interface catsMapper {
    long countByExample(catsExample example);

    int deleteByPrimaryKey(Integer catId);

    int insert(cats record);

    int insertSelective(cats record);

    List<cats> selectByExample(catsExample example);

    cats selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(cats record);

    int updateByPrimaryKey(cats record);
}