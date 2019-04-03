package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.PictureInfo;

public interface PictureInfoMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(PictureInfo record);

    int insertSelective(PictureInfo record);

    PictureInfo selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(PictureInfo record);

    int updateByPrimaryKey(PictureInfo record);
}