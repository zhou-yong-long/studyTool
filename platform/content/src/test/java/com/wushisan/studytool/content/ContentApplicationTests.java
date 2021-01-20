package com.wushisan.studytool.content;

import com.wushisan.studytool.content.service.BannerService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ContentApplicationTests {

    @Autowired
    BannerService bannerService;

    @Test
    void contextLoads() {
    }

}
