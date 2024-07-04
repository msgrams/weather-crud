package com.msgrams.mapper;

import com.msgrams.entity.District;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 11:07
 * @Description: com.msgrams.mapper
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class DistrictExtMapperTest {

    @Resource
    private DistrictExtMapper districtExtMapper;

    @Test
    void findDistictList() {
        List<District> distictList = districtExtMapper.findDistictList();
        distictList.forEach(e->{
            System.out.println(e.getId() + e.getName());
        });
    }
}