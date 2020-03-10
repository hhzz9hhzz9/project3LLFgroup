package com.woniu.mapper;

import com.woniu.pojo.film_actor;
import com.woniu.pojo.film_actorExample;
import java.util.List;

public interface film_actorMapper {
    long countByExample(film_actorExample example);

    int deleteByPrimaryKey(Integer filmActId);

    int insert(film_actor record);

    int insertSelective(film_actor record);

    List<film_actor> selectByExample(film_actorExample example);

    film_actor selectByPrimaryKey(Integer filmActId);

    int updateByPrimaryKeySelective(film_actor record);

    int updateByPrimaryKey(film_actor record);
}