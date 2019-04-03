package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.Stock;
import com.spt.helloworld.domain.StockExample;
import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

public interface StockMapper {
    long countByExample(StockExample example);

    int deleteByExample(StockExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    Stock selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);

    List<Stock> selectAll();

    List<Stock> selectByzId(Integer zId);
}