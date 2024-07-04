package com.msgrams.request;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 16:51
 * @Description: com.msgrams.request
 * @version: 1.0
 */
public class AirUpdateReq extends BaseReq{

    @NotNull
    private Integer id;
    private Integer districtId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date monitorTime;

    private Integer pm10;

    private Integer pm25;

    private String monitoringStation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }
}
