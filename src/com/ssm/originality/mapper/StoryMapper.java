package com.ssm.originality.mapper;

import com.ssm.originality.po.Story;
import com.ssm.originality.po.StoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoryMapper {
    int countByExample(StoryExample example);

    int deleteByExample(StoryExample example);

    int deleteByPrimaryKey(Integer storyId);

    int insert(Story record);

    int insertSelective(Story record);

    List<Story> selectByExample(StoryExample example);

    Story selectByPrimaryKey(Integer storyId);

    int updateByExampleSelective(@Param("record") Story record, @Param("example") StoryExample example);

    int updateByExample(@Param("record") Story record, @Param("example") StoryExample example);

    int updateByPrimaryKeySelective(Story record);

    int updateByPrimaryKey(Story record);
}