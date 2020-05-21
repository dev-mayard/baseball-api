package com.mayard.baseball_api.model.repository;

import com.mayard.baseball_api.model.domain.HitResult;
import com.mayard.baseball_api.model.vo.HitterNameVo;
import com.mayard.baseball_api.model.vo.PitcherNameVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HitResultRepository extends JpaRepository<HitResult, Long> {

    @Query(value =
            "SELECT new com.mayard.baseball_api.model.vo.HitterNameVo (" +
            "hitterName ) " +
            "FROM HitResult " +
            "GROUP BY hitterName " +
            "ORDER BY hitterName ASC ")
    public List<HitterNameVo> getHitterNames();

    @Query(value =
            "SELECT new com.mayard.baseball_api.model.vo.PitcherNameVo (" +
                    "pitcherName ) " +
                    "FROM HitResult " +
                    "GROUP BY pitcherName " +
                    "ORDER BY pitcherName ASC ")
    public List<PitcherNameVo> getPitcherNames();

}
