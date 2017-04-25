package com.ssm.originality.mapper;

import com.ssm.originality.po.OrderReturn;
import com.ssm.originality.po.OrderReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderReturnMapper {
    int countByExample(OrderReturnExample example);

    int deleteByExample(OrderReturnExample example);

    int deleteByPrimaryKey(Integer orderReturnId);

    int insert(OrderReturn record);

    int insertSelective(OrderReturn record);

    List<OrderReturn> selectByExample(OrderReturnExample example);

    OrderReturn selectByPrimaryKey(Integer orderReturnId);

    int updateByExampleSelective(@Param("record") OrderReturn record, @Param("example") OrderReturnExample example);

    int updateByExample(@Param("record") OrderReturn record, @Param("example") OrderReturnExample example);

    int updateByPrimaryKeySelective(OrderReturn record);

    int updateByPrimaryKey(OrderReturn record);
}