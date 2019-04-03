package com.spt.helloworld.controller;

import com.github.pagehelper.PageInfo;
import com.spt.helloworld.domain.Stock;
import com.spt.helloworld.domain.Users;
import com.spt.helloworld.service.StockService;
import com.spt.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/query.do"})
    public PageInfo<Stock> selectAll(@RequestParam Integer page,
                                     @RequestParam String uname){
        System.out.println(uname);
        Users users = userService.selectByUname(uname);
        Integer zid = users.getzId();
        return stockService.selectByUname(page,zid);
    }

    @RequestMapping(value = {"/add.do"})
    public int add(@RequestBody Stock stock){
        System.out.println(stock.toString());
        return stockService.add(stock);
    }

    @DeleteMapping(value = {"/del.do"})
    public int del(@RequestParam Integer gId){
        System.out.println(gId);
        return stockService.del(gId);
    }

    @RequestMapping(value = {"/update.do"})
    public int update(@RequestBody Stock stock){
        return stockService.update(stock);
    }

}
