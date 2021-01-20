package com.wushisan.studytool.content.dao;

import com.wushisan.studytool.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 10:52:35
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
