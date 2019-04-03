package com.spt.helloworld.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spt.helloworld.dao.mapper.GoodsMapper;
import com.spt.helloworld.domain.GoodsInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    public PageInfo<GoodsInfo> select(Integer page, Integer zId){
        Integer pagesize = 10;
        PageHelper.startPage(page,pagesize);
        List<GoodsInfo> list = goodsMapper.gooAndpic(zId);
        return new PageInfo<GoodsInfo>(list);
    }
}
