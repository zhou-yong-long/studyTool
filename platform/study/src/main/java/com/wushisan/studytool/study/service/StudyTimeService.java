package com.wushisan.studytool.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import utils.PageUtils;
import com.wushisan.studytool.study.entity.StudyTimeEntity;

import java.util.Map;

/**
 * 学习-用户学习时常表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:55:00
 */
public interface StudyTimeService extends IService<StudyTimeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

