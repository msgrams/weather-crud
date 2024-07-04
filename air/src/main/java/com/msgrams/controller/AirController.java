package com.msgrams.controller;

import com.github.pagehelper.PageInfo;
import com.msgrams.entity.District;
import com.msgrams.request.AirAddReq;
import com.msgrams.request.AirUpdateReq;
import com.msgrams.responese.BaseResp;
import com.msgrams.responese.ResultVO;
import com.msgrams.service.AirService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 10:13
 * @Description: com.msgrams.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/air")
public class AirController {

    @Resource
    private AirService airService;

    @Operation(summary = "查询区域信息")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "查找成功"),
            @ApiResponse(responseCode = "404", description = "查找失败")
    })
    @GetMapping("/distict/list")
    public ResultVO distictList(){
        List<District> list =  airService.findDistictList();
        return BaseResp.succ(list);
    }

    @GetMapping("/list")
    @Operation(summary = "查询空气质量信息")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "查找成功"),
            @ApiResponse(responseCode = "404", description = "查找失败")
    })
    public ResultVO airList(Integer page, Integer size, Integer districtId){
        PageInfo pageInfo = airService.findAirListByDistrictIdAndPage(page,size,districtId);
        return BaseResp.succ(pageInfo.getTotal(),pageInfo.getList());
    }

    @Operation(summary = "添加空气质量信息")
    @PostMapping("/add")
    public ResultVO airAdd(@Valid AirAddReq airAddReq, BindingResult result){
        // 查看参数是否合法
        if (result.hasErrors()) {
            // 有参数不满足要求
            String message = result.getFieldError().getDefaultMessage();
            // 返回参数不合法信息
            return BaseResp.error(400,message);
        }
        airService.add(airAddReq);

        return BaseResp.succ("添加成功");
    }


    @Operation(summary = "修改空气质量信息")
    @PostMapping("/update")
    public ResultVO airUpdate(AirUpdateReq airUpdateReq){
        Integer id = airUpdateReq.getId();
        if (id == null) {
            return BaseResp.error(400,"参数不合法");
        }
        airService.updateById(airUpdateReq);
        return BaseResp.succ("修改成功");
    }


    @Operation(summary = "删除空气质量信息")
    @DeleteMapping("/delete/{id}")
    public ResultVO airDelete(@PathVariable Integer id){

        // 调用service删除
        airService.deleteById(id);

        return BaseResp.succ("删除成功");
    }
}
