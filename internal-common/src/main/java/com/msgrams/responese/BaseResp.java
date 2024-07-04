package com.msgrams.responese;

import com.msgrams.constant.ResultConstant;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 10:20
 * @Description: com.msgrams.responese
 * @version: 1.0
 */
public class BaseResp {

    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultConstant.ERROR);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO succ(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultConstant.SUCCESS);
        resultVO.setMsg("");
        return resultVO;
    }

    public static ResultVO succ(Object data){
        ResultVO resultVO = succ();
        resultVO.setData(data);
        return resultVO;
    }

    public static ResultVO succ(Long total, Object data){
        ResultVO resultVO = succ(data);
        resultVO.setTotal(total);
        return resultVO;
    }

}
