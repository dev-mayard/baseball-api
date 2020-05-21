package com.mayard.baseball_api.model.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PlayerNameListVo {

    List<PitcherNameVo> pitchers;
    List<HitterNameVo> hitters;
}
