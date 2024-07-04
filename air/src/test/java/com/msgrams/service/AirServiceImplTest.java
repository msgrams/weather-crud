package com.msgrams.service;

import com.github.pagehelper.PageInfo;
import com.msgrams.entity.District;
import com.msgrams.request.AirAddReq;
import com.msgrams.request.AirUpdateReq;
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
 * @Date: 2024/7/4 - 11:05
 * @Description: com.msgrams.service
 * @version: 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class AirServiceImplTest {
    @Resource
    private AirService airService;

    @Test
    void findDistictList() {
        List<District> distictList = airService.findDistictList();
        distictList.forEach(e->{
            System.out.println(e.getId() + e.getName());
        });
    }
    @Test
    void findAirListByDistrictIdAndPage() {
        PageInfo pageInfo = airService.findAirListByDistrictIdAndPage(1, 5, null);
        pageInfo.getList().forEach(e->{
            System.out.println(e.toString());
        });
        System.out.println(pageInfo.getTotal());
    }


    @Test
    void add() {
        AirAddReq air = new AirAddReq();
        air.setDistrictId(3);
        air.setMonitorTime(new Date());
        air.setPm10(11);
        air.setPm25(22);
        air.setMonitoringStation("北城区");
        airService.add(air);
    }

    @Test
    void updateById() {
        AirUpdateReq air = new AirUpdateReq();
        air.setId(4);
        air.setDistrictId(5);
        air.setMonitorTime(new Date());
        air.setPm10(33);
        air.setPm25(33);
        air.setMonitoringStation("中城区");

        airService.updateById(air);
    }



    @org.junit.jupiter.api.Test
    public void deleteById() {
        airService.deleteById(5);
    }
}