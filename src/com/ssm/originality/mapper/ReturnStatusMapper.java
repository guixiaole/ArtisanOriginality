package com.ssm.originality.mapper;

import com.ssm.originality.po.ReturnStatus;
import com.ssm.originality.po.ReturnStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnStatusMapper {
    int countByExample(ReturnStatusExample example);

    int deleteByExample(ReturnStatusExample example);

    int deleteByPrimaryKey(Integer returnStatusId);

    int insert(ReturnStatus record);

    int insertSelective(ReturnStatus record);

    List<ReturnStatus> selectByExample(ReturnStatusExample example);

    ReturnStatus selectByPrimaryKey(Integer returnStatusId);

    int updateByExampleSelective(@Param("record") ReturnStatus record, @Param("example") ReturnStatusExample example);

    int updateByExample(@Param("record") ReturnStatus record, @Param("example") ReturnStatusExample example);

    int updateByPrimaryKeySelective(ReturnStatus record);

    int updateByPrimaryKey(ReturnStatus record);
}