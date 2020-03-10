package com.woniu.mapper;

import com.woniu.pojo.film_cats;
import com.woniu.pojo.film_catsExample;
import java.util.List;

public interface film_catsMapper {
    long countByExample(film_catsExample example);

    int deleteByPrimaryKey(Integer filmCatId);

    int insert(film_cats record);

    int insertSelective(film_cats record);

    List<film_cats> selectByExample(film_catsExample example);

    film_cats selectByPrimaryKey(Integer filmCatId);

    int updateByPrimaryKeySelective(film_cats record);

    int updateByPrimaryKey(film_cats record);
}