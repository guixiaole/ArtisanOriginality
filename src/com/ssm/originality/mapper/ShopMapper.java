package com.ssm.originality.mapper;

import com.ssm.originality.po.Shop;
import com.ssm.originality.po.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer shId);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer shId);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}