package com.ssm.originality.mapper;

import com.ssm.originality.po.Account;
import com.ssm.originality.po.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer acId);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer acId);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
    //用户登录的时候     语句里判断是手机还是邮箱登录
    Account loginByUser(Account account) throws Exception ;
    //用户注册的时候  语句里判断是手机还是邮箱注册
    void registByUser(Account account)throws Exception;
}