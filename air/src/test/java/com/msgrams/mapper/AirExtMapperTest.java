package com.msgrams.mapper;

import com.msgrams.entity.Air;
import com.msgrams.request.AirUpdateReq;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 11:28
 * @Description: com.msgrams.mapper
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class AirExtMapperTest {

    @Resource
    private AirExtMapper airExtMapper;
    @Test
    void findByDistrictId() {
        List<Air> airList = airExtMapper.findByDistrictId(null);
        airList.forEach(e->{
            System.out.println(e.toString());
        });
    }

    @Test
    void insert() {
        Air air = new Air();
        air.setDistrictId(2);
        air.setMonitorTime(new Date());
        air.setPm10(10);
        air.setPm25(25);
        air.setMonitoringStation("长沙监测站！!!！");

        int count = airExtMapper.insert(air);
        Assert.assertEquals(1,count);
    }

    @Test
    void updateById() {
        AirUpdateReq air = new AirUpdateReq();
        air.setId(4);
        air.setDistrictId(5);
        air.setMonitorTime(new Date());
        air.setPm10(15);
        air.setPm25(26);
        air.setMonitoringStation("中城区");

        airExtMapper.updateById(air);
    }

    @Test
    void deleteById() {
        airExtMapper.deleteById(5);
    }
}