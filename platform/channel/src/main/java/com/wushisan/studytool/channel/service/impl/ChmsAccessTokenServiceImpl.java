package com.wushisan.studytool.channel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import utils.PageUtils;
import utils.Query;

import com.wushisan.studytool.channel.dao.ChmsAccessTokenDao;
import com.wushisan.studytool.channel.entity.ChmsAccessTokenEntity;
import com.wushisan.studytool.channel.service.ChmsAccessTokenService;


@Service("chmsAccessTokenService")
public class ChmsAccessTokenServiceImpl extends ServiceImpl<ChmsAccessTokenDao, ChmsAccessTokenEntity> implements ChmsAccessTokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ChmsAccessTokenEntity> page = this.page(
                new Query<ChmsAccessTokenEntity>().getPage(params),
                new QueryWrapper<ChmsAccessTokenEntity>()
        );

        return new PageUtils(page);
    }

}