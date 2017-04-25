package com.ssm.originality.mapper;

import com.ssm.originality.po.Car;
import com.ssm.originality.po.CarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMapper {
    int countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(Integer caId);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(Integer caId);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}