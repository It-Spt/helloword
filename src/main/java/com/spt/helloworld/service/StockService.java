package com.spt.helloworld.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spt.helloworld.dao.mapper.StockMapper;
import com.spt.helloworld.domain.Stock;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockService {
    @Resource
    private StockMapper stockMapper;

    public PageInfo<Stock> selectAll(Integer page){
        Integer pagesize = 10;
        PageHelper.startPage(page,pagesize);
        List<Stock> list = stockMapper.selectAll();
        return new PageInfo<Stock>(list);
    }

    public PageInfo<Stock> selectByUname(Integer page,Integer zId){
        Integer pagesize = 10;
        PageHelper.startPage(page,pagesize);
        List<Stock> list = stockMapper.selectByzId(zId);
        return new PageInfo<Stock>(list);
    }

    public int add(Stock stock){
        return stockMapper.insert(stock);
    }

    public int del(Integer id){
        return stockMapper.deleteByPrimaryKey(id);
    }

    public int update(Stock stock){return stockMapper.updateByPrimaryKey(stock);}
}
