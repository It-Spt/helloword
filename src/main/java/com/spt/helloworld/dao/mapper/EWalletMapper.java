package com.spt.helloworld.dao.mapper;

import com.spt.helloworld.domain.EWallet;
import com.spt.helloworld.domain.EWalletExample;
import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

public interface EWalletMapper {
    long countByExample(EWalletExample example);

    int deleteByExample(EWalletExample example);

    int deleteByPrimaryKey(Integer walledId);

    int insert(EWallet record);

    int insertSelective(EWallet record);

    List<EWallet> selectByExample(EWalletExample example);

    EWallet selectByPrimaryKey(Integer walledId);

    int updateByExampleSelective(@Param("record") EWallet record, @Param("example") EWalletExample example);

    int updateByExample(@Param("record") EWallet record, @Param("example") EWalletExample example);

    int updateByPrimaryKeySelective(EWallet record);

    int updateByPrimaryKey(EWallet record);

    EWallet selectByzid(Integer zId);
}