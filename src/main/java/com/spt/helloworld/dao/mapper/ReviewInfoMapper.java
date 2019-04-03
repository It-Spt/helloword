package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.ReviewInfo;

import java.util.List;

public interface ReviewInfoMapper {
    int deleteByPrimaryKey(Integer reId);

    int insert(ReviewInfo record);

    int insertSelective(ReviewInfo record);

    ReviewInfo selectByPrimaryKey(Integer reId);

    int updateByPrimaryKeySelective(ReviewInfo record);

    int updateByPrimaryKey(ReviewInfo record);

    List<ReviewInfo> queryByState(String state);

}