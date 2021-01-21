package com.wushisan.studytool.question;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wushisan.studytool.question.entity.TypeEntity;
import com.wushisan.studytool.question.service.QuestionService;
import com.wushisan.studytool.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class QuestionApplicationTests {

    @Autowired
    QuestionService questionService;


    @Autowired
    TypeService typeService;

    @Test
    void contextLoads() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setSubjectType("JVM");
        List<TypeEntity> list = typeService.list();
        List<Long> idList = new ArrayList<>();
        for(TypeEntity i : list){
            idList.add(i.getId());
        }
        typeService.save(typeEntity);
        System.out.println("删除成功");
    }

}
