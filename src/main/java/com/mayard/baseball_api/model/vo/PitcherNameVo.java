package com.mayard.baseball_api.model.vo;

import lombok.Data;

@Data
public class PitcherNameVo {

    private String pitcherName;

    public PitcherNameVo(String pitcherName) {
        this.pitcherName = pitcherName;
    }
}
