package com.mayard.baseball_api.model.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonResponseVo<T> {

    private String message;

    private T data;
}
