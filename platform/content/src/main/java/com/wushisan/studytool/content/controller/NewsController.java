package com.wushisan.studytool.content.controller;

import java.util.Arrays;
import java.util.Map;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wushisan.studytool.content.entity.NewsEntity;
import com.wushisan.studytool.content.service.NewsService;
import utils.PageUtils;
import utils.R;



/**
 * 内容-资讯表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 10:52:35
 */
@CrossOrigin
@RestController
@RequestMapping("content/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 列表
     */
    @RequestMapping("/list")

    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = newsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("content:news:info")
    public R info(@PathVariable("id") Long id){
		NewsEntity news = newsService.getById(id);

        return R.ok().put("news", news);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("content:news:save")
    public R save(@RequestBody NewsEntity news){
		newsService.save(news);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("content:news:update")
    public R update(@RequestBody NewsEntity news){
		newsService.updateById(news);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("content:news:delete")
    public R delete(@RequestBody Long[] ids){
		newsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
