package com.spt.helloworld.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spt.helloworld.dao.mapper.ReviewInfoMapper;
import com.spt.helloworld.domain.ReviewInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReviewService {
    @Resource
    private ReviewInfoMapper reviewInfoMapper;

    public PageInfo<ReviewInfo> queryByState(String state, Integer size, Integer page){
        PageHelper.startPage(page,size);
        List<ReviewInfo> list = reviewInfoMapper.queryByState(state);
        return new PageInfo<>(list);
    }

    public int update(ReviewInfo reviewInfo){
        return reviewInfoMapper.updateByPrimaryKeySelective(reviewInfo);
    }

    public ReviewInfo selectById(Integer id){
        return reviewInfoMapper.selectByPrimaryKey(id);
    }
}
