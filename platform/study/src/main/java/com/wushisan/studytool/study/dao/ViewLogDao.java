package com.wushisan.studytool.study.dao;

import com.wushisan.studytool.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:55:00
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
