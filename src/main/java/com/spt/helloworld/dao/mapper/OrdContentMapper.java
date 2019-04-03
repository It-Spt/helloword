package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.OrdContent;
import com.spt.helloworld.domain.OrdContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdContentMapper {
    long countByExample(OrdContentExample example);

    int deleteByExample(OrdContentExample example);

    int deleteByPrimaryKey(Integer conId);

    int insert(OrdContent record);

    int insertSelective(OrdContent record);

    List<OrdContent> selectByExample(OrdContentExample example);

    OrdContent selectByPrimaryKey(Integer conId);

    int updateByExampleSelective(@Param("record") OrdContent record, @Param("example") OrdContentExample example);

    int updateByExample(@Param("record") OrdContent record, @Param("example") OrdContentExample example);

    int updateByPrimaryKeySelective(OrdContent record);

    int updateByPrimaryKey(OrdContent record);
}