package com.wushisan.studytool.channel.dao;

import com.wushisan.studytool.channel.entity.ChmsAccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-19 16:55:20
 */
@Mapper
public interface ChmsAccessTokenDao extends BaseMapper<ChmsAccessTokenEntity> {
	
}
