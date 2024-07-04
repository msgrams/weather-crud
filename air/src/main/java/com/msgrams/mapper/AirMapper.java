package com.msgrams.mapper;


import java.util.List;

import com.msgrams.entity.Air;
import com.msgrams.entity.AirExample;
import org.apache.ibatis.annotations.Param;

public interface AirMapper {
    int countByExample(AirExample example);

    int deleteByExample(AirExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Air record);

    int insertSelective(Air record);

    List<Air> selectByExample(AirExample example);

    Air selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Air record, @Param("example") AirExample example);

    int updateByExample(@Param("record") Air record, @Param("example") AirExample example);

    int updateByPrimaryKeySelective(Air record);

    int updateByPrimaryKey(Air record);
}