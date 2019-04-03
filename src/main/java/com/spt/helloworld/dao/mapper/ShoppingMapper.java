package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.Shopping;
import com.spt.helloworld.domain.ShoppingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingMapper {
    long countByExample(ShoppingExample example);

    int deleteByExample(ShoppingExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    List<Shopping> selectByExample(ShoppingExample example);

    Shopping selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    int updateByExample(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKey(Shopping record);
}