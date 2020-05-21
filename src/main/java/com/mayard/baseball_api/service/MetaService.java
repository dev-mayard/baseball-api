package com.mayard.baseball_api.service;

import com.mayard.baseball_api.model.repository.HitResultRepository;
import com.mayard.baseball_api.model.vo.HitterNameVo;
import com.mayard.baseball_api.model.vo.PitcherNameVo;
import com.mayard.baseball_api.model.vo.PlayerNameListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaService {

    @Autowired
    private HitResultRepository hitResultRepository;

    public PlayerNameListVo getPlayerNames() {
        return PlayerNameListVo.builder()
                .hitters(getHitterNames())
                .pitchers(getPitcherName())
                .build();
    }

    private List<PitcherNameVo> getPitcherName() {
        return hitResultRepository.getPitcherNames();
    }

    private List<HitterNameVo> getHitterNames() {
        return hitResultRepository.getHitterNames();
    }
}
