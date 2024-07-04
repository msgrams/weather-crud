package com.msgrams.mapper;

import com.msgrams.entity.District;
import com.msgrams.entity.DistrictExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DistrictExtMapper {

    List<District> findDistictList();
}