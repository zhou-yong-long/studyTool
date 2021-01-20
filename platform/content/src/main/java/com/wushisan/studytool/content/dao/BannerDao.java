package com.wushisan.studytool.content.dao;

import com.wushisan.studytool.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 10:52:35
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
