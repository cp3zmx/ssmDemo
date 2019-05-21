package com.ays.service.impl;

import com.ays.dao.RankMapper;
import com.ays.model.Rank;
import com.ays.service.RankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: cp3_Ays
 * @Description:
 * @Create Date: 2019/5/21 11:38
 * @Modified By：
 * @Copyright: 2019/5/21 company:jrs.
 */
@Service
public class RankServiceImpl implements RankService {
    @Resource
    private RankMapper rankMapper;
    @Override
    public List<Rank> getAllRank() {
        return rankMapper.selectAllRank();
    }
}
