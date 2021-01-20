package com.wushisan.studytool.question;

import com.wushisan.studytool.question.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuestionApplicationTests {

    @Autowired
    QuestionService questionService;

    @Test
    void contextLoads() {

    }

}
