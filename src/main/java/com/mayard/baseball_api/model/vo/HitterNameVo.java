package com.mayard.baseball_api.model.vo;

import lombok.Data;

@Data
public class HitterNameVo {

    private String hitterName;

    public HitterNameVo(String hitterName) {
        this.hitterName = hitterName;
    }
}
