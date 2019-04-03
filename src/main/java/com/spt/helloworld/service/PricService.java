package com.spt.helloworld.service;

import com.spt.helloworld.dao.mapper.PictureInfoMapper;
import com.spt.helloworld.domain.PictureInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PricService {
    @Resource
    private PictureInfoMapper pictureInfoMapper;

    public int addpic(PictureInfo pictureInfo){
        return pictureInfoMapper.insertSelective(pictureInfo);
    }
}
