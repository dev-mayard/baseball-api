package com.mayard.baseball_api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hitresult")
@Api("/hitresult")
@Slf4j
public class HitResultController {

    @ApiOperation(value = "도서 판매여부 정보 ")
    @ApiResponses({
            @ApiResponse(code = 200, message = "SUCCESS"),
    })
    @GetMapping("/hitter")
    public String getHitterList() {
        return "";
    }
}
