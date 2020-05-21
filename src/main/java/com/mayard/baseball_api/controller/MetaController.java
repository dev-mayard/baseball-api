package com.mayard.baseball_api.controller;

import com.mayard.baseball_api.model.vo.CommonResponseVo;
import com.mayard.baseball_api.service.MetaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meta")
@Api("/meta")
@Slf4j
public class MetaController {

    @Autowired
    private MetaService metaService;

    @ApiOperation(value = "선수 이름 정보")
    @ApiResponses({
            @ApiResponse(code = 200, message = "SUCCESS"),
    })
    @GetMapping("/player")
    public ResponseEntity<CommonResponseVo> getHitterList() {
        return new ResponseEntity<>(
                CommonResponseVo.builder()
                .data(metaService.getPlayerNames())
                .build(), HttpStatus.OK);
    }
}
