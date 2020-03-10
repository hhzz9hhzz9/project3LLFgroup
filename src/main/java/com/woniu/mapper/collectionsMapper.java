package com.woniu.mapper;

import com.woniu.pojo.collections;
import com.woniu.pojo.collectionsExample;
import java.util.List;

public interface collectionsMapper {
    long countByExample(collectionsExample example);

    int deleteByPrimaryKey(Integer collectionId);

    int insert(collections record);

    int insertSelective(collections record);

    List<collections> selectByExample(collectionsExample example);

    collections selectByPrimaryKey(Integer collectionId);

    int updateByPrimaryKeySelective(collections record);

    int updateByPrimaryKey(collections record);
}