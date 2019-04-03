package com.spt.helloworld.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spt.helloworld.domain.EWallet;
import com.spt.helloworld.domain.ReviewInfo;
import com.spt.helloworld.service.EwallService;
import com.spt.helloworld.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @Autowired
    private EwallService es;

    @GetMapping(value = {"/state.do"})
    public PageInfo<ReviewInfo> queryByState(@RequestParam String state,
                                             @RequestParam Integer page){
        System.out.println(page+"-----"+state);
        final Integer pagesize = 10;
        return reviewService.queryByState(state,pagesize,page);
    }

    @RequestMapping(value = {"/upadtestate.do"})
    public int update(@RequestParam String state,
                      @RequestParam Integer zid,
                      @RequestParam Integer reId,
                      @RequestParam double monery,
                      @RequestParam String type){
        System.out.println(state+"---"+reId+"----------"+monery+"---"+zid);
        ReviewInfo ri = new ReviewInfo();
        ri.setReId(reId);
        ri.setState(state);
        if(reviewService.update(ri)>0){
            EWallet eWallet = new EWallet();
            eWallet = es.selectByzid(zid);
            System.out.println(eWallet.getMonery());
            double a = eWallet.getMonery();
            if (type.equals('+')){
                System.out.println("111");
                eWallet.setMonery(a+monery);
            }else{
                System.out.println(type);
                if((a-monery)>0){
                    System.out.println(123);
                    eWallet.setMonery(a-monery);
                }else{
                    return 0;
                }

            }
            if(es.update(eWallet)>0){
                return 1;
            }
        }
        return 0;
    }
}
