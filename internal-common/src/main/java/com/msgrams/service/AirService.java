package com.msgrams.service;

import com.github.pagehelper.PageInfo;
import com.msgrams.entity.District;
import com.msgrams.request.AirAddReq;
import com.msgrams.request.AirUpdateReq;

import java.util.List;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 10:44
 * @Description: com.msgrams.service
 * @version: 1.0
 */
public interface AirService {


    /*
     * 查询区域表中所有信息
     * */
    List<District> findDistictList();

    /**
     * 分页&条件查询空气质量信息
     * @param page
     * @param size
     * @param districtId
     * @return
     */
    PageInfo findAirListByDistrictIdAndPage(Integer page, Integer size, Integer districtId);


    /**
     * 添加空气质量信息
     * @param airAddReq
     */
    void add(AirAddReq airAddReq);

    /**
     * 修改空气质量信息
     * @param airUpdateReq
     */
    void updateById(AirUpdateReq airUpdateReq);


    void deleteById(Integer id);
}
