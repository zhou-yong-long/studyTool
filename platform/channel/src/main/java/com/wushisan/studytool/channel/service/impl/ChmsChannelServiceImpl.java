package com.wushisan.studytool.channel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import utils.PageUtils;
import utils.Query;

import com.wushisan.studytool.channel.dao.ChmsChannelDao;
import com.wushisan.studytool.channel.entity.ChmsChannelEntity;
import com.wushisan.studytool.channel.service.ChmsChannelService;


@Service("chmsChannelService")
public class ChmsChannelServiceImpl extends ServiceImpl<ChmsChannelDao, ChmsChannelEntity> implements ChmsChannelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ChmsChannelEntity> page = this.page(
                new Query<ChmsChannelEntity>().getPage(params),
                new QueryWrapper<ChmsChannelEntity>()
        );

        return new PageUtils(page);
    }

}