package com.ssm.originality.mapper;

import com.ssm.originality.po.CashRecord;
import com.ssm.originality.po.CashRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashRecordMapper {
    int countByExample(CashRecordExample example);

    int deleteByExample(CashRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(CashRecord record);

    int insertSelective(CashRecord record);

    List<CashRecord> selectByExample(CashRecordExample example);

    CashRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByExample(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByPrimaryKeySelective(CashRecord record);

    int updateByPrimaryKey(CashRecord record);
}