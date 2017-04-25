package com.ssm.originality.mapper;

import com.ssm.originality.po.OrderStatus;
import com.ssm.originality.po.OrderStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatusMapper {
    int countByExample(OrderStatusExample example);

    int deleteByExample(OrderStatusExample example);

    int deleteByPrimaryKey(Integer orderStatusId);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    List<OrderStatus> selectByExample(OrderStatusExample example);

    OrderStatus selectByPrimaryKey(Integer orderStatusId);

    int updateByExampleSelective(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByExample(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}