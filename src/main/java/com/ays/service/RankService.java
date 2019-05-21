package com.ays.service;

import com.ays.model.Rank;

import java.util.List;

/**
 * @Author: cp3_Ays
 * @Description:   员工等级事物处理抽象
 * @Date:Create：in 2019/5/21 11:36
 * @Modified By：
 * @Copyright: 2019/5/21 company:jrs.
 */
public interface RankService {
    /**
     * 功能描述:获取所有的员工等级信息列表
     * @Author cp3_Ays
     * @Date 11:39 2019/5/21
     * @Param []
     * @return java.util.List<com.ays.model.Rank> 
    **/
    List<Rank> getAllRank();
}
