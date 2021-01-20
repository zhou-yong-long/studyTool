package com.wushisan.studytool.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import utils.PageUtils;
import com.wushisan.studytool.channel.entity.ChmsAccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-19 16:55:20
 */
public interface ChmsAccessTokenService extends IService<ChmsAccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

