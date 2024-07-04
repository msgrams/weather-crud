package com.msgrams.responese;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 10:20
 * @Description: com.msgrams.responese
 * @version: 1.0
 */
public class ResultVO {

    private Integer code;

    private String msg;

    private Object data;

    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private Long total;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ResultVO() {
    }

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO(Integer code, String msg, Object data, Long total) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.total = total;
    }
}
