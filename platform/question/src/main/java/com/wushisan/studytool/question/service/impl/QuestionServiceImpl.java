package com.wushisan.studytool.question.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import utils.PageUtils;
import utils.Query;

import com.wushisan.studytool.question.dao.QuestionDao;
import com.wushisan.studytool.question.entity.QuestionEntity;
import com.wushisan.studytool.question.service.QuestionService;


@Service("questionService")
public class QuestionServiceImpl extends ServiceImpl<QuestionDao, QuestionEntity> implements QuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QuestionEntity> page = this.page(
                new Query<QuestionEntity>().getPage(params),
                new QueryWrapper<QuestionEntity>()
        );

        return new PageUtils(page);
    }

}