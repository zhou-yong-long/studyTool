package com.wushisan.studytool.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import utils.PageUtils;
import com.wushisan.studytool.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:32:45
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

