package com.msgrams.mapper;


import com.msgrams.entity.Air;
import com.msgrams.request.AirUpdateReq;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirExtMapper {

    /**
     * 查询空气质量的SQL扔Mapper里
     * @param districtId
     * @return
     */
    List<Air> findByDistrictId(@Param("districtId") Integer districtId);

    int insert(Air air);

    int updateById(AirUpdateReq airUpdateReq);

    int deleteById(@Param("id") Integer id);
}