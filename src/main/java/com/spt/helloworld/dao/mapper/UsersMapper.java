package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.Users;
import com.spt.helloworld.domain.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer zId);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer zId);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> selectAll();

    List<Users> selectByPower(String power);

    String login(@Param("loginName") String loginName, @Param("passwords")String passwords);

    int delByname(@Param("loginName") String loginName);

    Users selectByUname(String loginName);
}