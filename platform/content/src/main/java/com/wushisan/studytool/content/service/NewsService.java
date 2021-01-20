package com.wushisan.studytool.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import utils.PageUtils;
import com.wushisan.studytool.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 10:52:35
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

