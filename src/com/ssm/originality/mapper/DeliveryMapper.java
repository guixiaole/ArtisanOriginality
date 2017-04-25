package com.ssm.originality.mapper;

import com.ssm.originality.po.Delivery;
import com.ssm.originality.po.DeliveryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryMapper {
    int countByExample(DeliveryExample example);

    int deleteByExample(DeliveryExample example);

    int deleteByPrimaryKey(Integer deId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    List<Delivery> selectByExample(DeliveryExample example);

    Delivery selectByPrimaryKey(Integer deId);

    int updateByExampleSelective(@Param("record") Delivery record, @Param("example") DeliveryExample example);

    int updateByExample(@Param("record") Delivery record, @Param("example") DeliveryExample example);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
}