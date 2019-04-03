package com.spt.helloworld.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spt.helloworld.dao.mapper.UsersMapper;
import com.spt.helloworld.domain.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UsersMapper usersInfoMapper;

    public PageInfo<Users> queryBypage(String power,Integer page, Integer pagesize){
        PageHelper.startPage(page,pagesize);
        List<Users> list = usersInfoMapper.selectByPower(power);
        return new PageInfo<Users>(list);
    }

    public List<Users> queryAll(){
        return usersInfoMapper.selectAll();
    }

    public String login(String id,String pass){
        return usersInfoMapper.login(id,pass);
    }

    public int intsert(Users usersInfo){return usersInfoMapper.insert(usersInfo);}

    public int delByLogname(String logName){return usersInfoMapper.delByname(logName);}

    public int addusers(Users users){
        return usersInfoMapper.insert(users);
    }

    public int update(Users users){return usersInfoMapper.updateByPrimaryKey(users);}

    public Users selectByUname(String loginName){
        return usersInfoMapper.selectByUname(loginName);
    }

}
