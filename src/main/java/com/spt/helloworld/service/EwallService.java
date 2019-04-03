package com.spt.helloworld.service;

import com.spt.helloworld.dao.mapper.EWalletMapper;
import com.spt.helloworld.domain.EWallet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EwallService {
    @Resource
    private EWalletMapper ew;

    public EWallet seletById(Integer id){
        return ew.selectByPrimaryKey(id);
    }

    public EWallet selectByzid(Integer id){
        return ew.selectByzid(id);
    }

    public int update(EWallet eWallet){
        return ew.updateByPrimaryKeySelective(eWallet);
    }
}
