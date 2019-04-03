package com.spt.helloworld.controller;

import com.github.pagehelper.PageInfo;
import com.spt.helloworld.domain.Echart;
import com.spt.helloworld.domain.Users;
import com.spt.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    /**
     *
     * 分页查询账号
     * @param page
     * @return
     */
    @GetMapping(value = {"/query.do"})
    public PageInfo<Users> query(@RequestParam Integer page,
                                 @RequestParam String power){
        System.out.println(page+"-----"+power);
        Integer pagesize = 10;
        return userService.queryBypage(power,page,pagesize);
    }

    @GetMapping(value = {"/echart.do"})
    public Echart echart(){
        Integer x = 0;
        Integer y = 0;
        Integer z = 0;
        List<Users> l_users = userService.queryAll();
        for (Users users:l_users) {
            System.out.println(users.toString());
           if(users.getPower().equals("s")){
               x++;
           }else if(users.getPower().equals("u")){
               y++;
           }else{
               z++;
           }
        }
        Echart echart = new Echart(
                new String[]{"管理员","供应商","买家"},
                new Integer[]{x,y,z}
        );
        return echart;
    }

    /**
     *
     * 用户登陆
     * @param loginName
     * @param passwords
     * @return
     */
    @GetMapping(value = {"/login.do"})
    public String login(@RequestParam String loginName,
                        @RequestParam String passwords
                        ){
        String power = userService.login(loginName,passwords);
        if(power!=null){
            return power;
        }else {
            return "账号或密码错误！";
        }
    }

    @DeleteMapping(value = {"/del.do/{loginName}"})
    public int delByLoginName(@PathVariable String loginName){
        System.out.println(loginName);
        return userService.delByLogname(loginName);
    }

    @RequestMapping(value = {"/add.do"})
    public int add(@RequestBody Users user){
        System.out.println(user.getLoginName());
        return userService.addusers(user);
    }

    @RequestMapping(value = {"/update.do"})
    public int update(@RequestBody Users user){
        System.out.println(user.getIsMonery());
        return userService.update(user);
    }

    @PostMapping(value = {"/sign.do"})
    public int sign(Users usersInfo){
        int a = userService.intsert(usersInfo);
        if(a>0){
            return a;
        }else {
            return 0;
        }
    }


}
