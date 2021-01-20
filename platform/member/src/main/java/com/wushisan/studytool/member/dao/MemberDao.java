package com.wushisan.studytool.member.dao;

import com.wushisan.studytool.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:32:45
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
