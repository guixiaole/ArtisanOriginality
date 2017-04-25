package com.ssm.originality.mapper;

import com.ssm.originality.po.ProductType;
import com.ssm.originality.po.ProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTypeMapper {
    int countByExample(ProductTypeExample example);

    int deleteByExample(ProductTypeExample example);

    int deleteByPrimaryKey(Integer proTypeId);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    List<ProductType> selectByExample(ProductTypeExample example);

    ProductType selectByPrimaryKey(Integer proTypeId);

    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);
}