package com.wushisan.studytool.question.dao;

import com.wushisan.studytool.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:43:14
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
