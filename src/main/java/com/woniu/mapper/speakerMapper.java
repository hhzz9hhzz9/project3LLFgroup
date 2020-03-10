package com.woniu.mapper;

import com.woniu.pojo.speaker;
import com.woniu.pojo.speakerExample;
import java.util.List;

public interface speakerMapper {
    long countByExample(speakerExample example);

    int deleteByPrimaryKey(Integer speakerId);

    int insert(speaker record);

    int insertSelective(speaker record);

    List<speaker> selectByExample(speakerExample example);

    speaker selectByPrimaryKey(Integer speakerId);

    int updateByPrimaryKeySelective(speaker record);

    int updateByPrimaryKey(speaker record);
}