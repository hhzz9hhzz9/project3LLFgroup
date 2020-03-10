package com.woniu.mapper;

import com.woniu.pojo.film;
import com.woniu.pojo.filmExample;
import java.util.List;

public interface filmMapper {
    long countByExample(filmExample example);

    int deleteByPrimaryKey(Integer filmId);

    int insert(film record);

    int insertSelective(film record);

    List<film> selectByExample(filmExample example);

    film selectByPrimaryKey(Integer filmId);

    int updateByPrimaryKeySelective(film record);

    int updateByPrimaryKey(film record);
}