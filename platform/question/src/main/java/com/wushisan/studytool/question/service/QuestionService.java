package com.wushisan.studytool.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import utils.PageUtils;
import com.wushisan.studytool.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:43:14
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

