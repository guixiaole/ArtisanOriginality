package com.ssm.originality.mapper;

import com.ssm.originality.po.Artisan;
import com.ssm.originality.po.ArtisanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArtisanMapper {
    int countByExample(ArtisanExample example);

    int deleteByExample(ArtisanExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    List<Artisan> selectByExample(ArtisanExample example);

    Artisan selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Artisan record, @Param("example") ArtisanExample example);

    int updateByExample(@Param("record") Artisan record, @Param("example") ArtisanExample example);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
}