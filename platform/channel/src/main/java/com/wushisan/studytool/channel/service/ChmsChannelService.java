package com.wushisan.studytool.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import utils.PageUtils;
import com.wushisan.studytool.channel.entity.ChmsChannelEntity;

import java.util.Map;

/**
 * 渠道-渠道表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-19 16:55:20
 */
public interface ChmsChannelService extends IService<ChmsChannelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

