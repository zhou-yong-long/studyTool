package com.wushisan.studytool.content.controller;

import java.util.Arrays;
import java.util.Map;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wushisan.studytool.content.entity.BannerEntity;
import com.wushisan.studytool.content.service.BannerService;
import utils.PageUtils;
import utils.R;



/**
 * 内容-横幅广告表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 10:52:35
 */
@RestController
@RequestMapping("content/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * 列表
     */
    @RequestMapping("/list")

    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bannerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("content:banner:info")
    public R info(@PathVariable("id") Long id){
		BannerEntity banner = bannerService.getById(id);

        return R.ok().put("banner", banner);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("content:banner:save")
    public R save(@RequestBody BannerEntity banner){
		bannerService.save(banner);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("content:banner:update")
    public R update(@RequestBody BannerEntity banner){
		bannerService.updateById(banner);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("content:banner:delete")
    public R delete(@RequestBody Long[] ids){
		bannerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
