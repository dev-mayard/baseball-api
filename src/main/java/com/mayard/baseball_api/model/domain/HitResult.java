package com.mayard.baseball_api.model.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class HitResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hitResultNo;

    private String hitterName;

    private String pitcherName;

    private String hitResult;

    private String axisLeft;

    private String axisTop;

    private String inning;

    private String gamedate;

    private String hometeam;

    private String awayteam;
}
