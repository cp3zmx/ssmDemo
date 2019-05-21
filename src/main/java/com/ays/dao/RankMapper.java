package com.ays.dao;

import com.ays.model.Rank;

import java.util.List;

public interface RankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rank record);

    int insertSelective(Rank record);

    Rank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
    /**
     * 功能描述:查询所有
     * @Author cp3_Ays
     * @Date 11:34 2019/5/21
     * @Param []
     * @return List<Rank> 
    **/
    List<Rank> selectAllRank();
}