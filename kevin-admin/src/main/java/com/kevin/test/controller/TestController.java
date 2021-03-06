package com.kevin.test.controller;

import com.kevin.common.entity.Result;
import com.kevin.common.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Api(description = "测试Controller")
public class TestController {

    @ApiModelProperty("测试Swagger")
    @GetMapping("/hello")
    private Result hello() {
        return ResultUtil.success();
    }
}
