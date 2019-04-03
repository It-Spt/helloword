package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.GoodsInfo;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);

    List<GoodsInfo> selectAll();

    List<GoodsInfo> gooAndpic(Integer zId);
}