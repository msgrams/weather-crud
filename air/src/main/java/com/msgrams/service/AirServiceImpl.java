package com.msgrams.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msgrams.entity.Air;
import com.msgrams.entity.District;
import com.msgrams.mapper.AirExtMapper;
import com.msgrams.mapper.DistrictExtMapper;
import com.msgrams.request.AirAddReq;
import com.msgrams.request.AirUpdateReq;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 11:00
 * @Description: com.msgrams.service
 * @version: 1.0
 */
@Service
public class AirServiceImpl implements AirService {

    @Resource
    private DistrictExtMapper districtExtMapper;

    @Resource
    private AirExtMapper airExtMapper;

    @Override
    public List<District> findDistictList() {

        List<District> list = districtExtMapper.findDistictList();
        return list;
    }

    @Override
    public PageInfo findAirListByDistrictIdAndPage(Integer page, Integer size, Integer districtId) {
        // 分页
        PageHelper.startPage(page, size);

        // 查询
        List<Air> airList = airExtMapper.findByDistrictId(districtId);

        // 封装
        PageInfo pageInfo = new PageInfo(airList);

        return pageInfo;
    }

    @Override
    @Transactional
    public void add(AirAddReq airAddReq) {
        // 封装数据
        Air air = new Air();
        BeanUtils.copyProperties(airAddReq,air);

        // 添加数据
        int count = airExtMapper.insert(air);

        // 判断count
        if (count != 1) {
            System.out.println("添加空气质量  失败");
            throw new RuntimeException("add error！");
        }
    }

    @Override
    public void updateById(AirUpdateReq airUpdateReq) {
        // 修改数据
        int count = airExtMapper.updateById(airUpdateReq);

        // 不成功 抛出异常
        if (count != 1) {
            System.out.println("【修改空气质量】  修改失败！！");
            throw new RuntimeException("【修改空气质量】  修改失败！！");        }
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {

        // 删除
        int count = airExtMapper.deleteById(id);

        //判断
        if (count != 1) {
            System.out.println("删除空气质量 失败");
            throw new RuntimeException("删除空气质量 失败");
        }
    }
}
