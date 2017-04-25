package com.ssm.originality.mapper;

import com.ssm.originality.po.Limit;
import com.ssm.originality.po.LimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimitMapper {
    int countByExample(LimitExample example);

    int deleteByExample(LimitExample example);

    int deleteByPrimaryKey(Integer limitId);

    int insert(Limit record);

    int insertSelective(Limit record);

    List<Limit> selectByExample(LimitExample example);

    Limit selectByPrimaryKey(Integer limitId);

    int updateByExampleSelective(@Param("record") Limit record, @Param("example") LimitExample example);

    int updateByExample(@Param("record") Limit record, @Param("example") LimitExample example);

    int updateByPrimaryKeySelective(Limit record);

    int updateByPrimaryKey(Limit record);
}