package com.wushisan.studytool.study.dao;

import com.wushisan.studytool.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:55:00
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
