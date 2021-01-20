package com.wushisan.studytool.channel.controller;

import java.util.Arrays;
import java.util.Map;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wushisan.studytool.channel.entity.ChmsChannelEntity;
import com.wushisan.studytool.channel.service.ChmsChannelService;
import utils.PageUtils;
import utils.R;



/**
 * 渠道-渠道表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-19 16:55:20
 */
@RestController
@RequestMapping("channel/chmschannel")
public class ChmsChannelController {
    @Autowired
    private ChmsChannelService chmsChannelService;

    /**
     * 列表
     */
    @RequestMapping("/list")

    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = chmsChannelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("channel:chmschannel:info")
    public R info(@PathVariable("id") Long id){
		ChmsChannelEntity chmsChannel = chmsChannelService.getById(id);

        return R.ok().put("chmsChannel", chmsChannel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("channel:chmschannel:save")
    public R save(@RequestBody ChmsChannelEntity chmsChannel){
		chmsChannelService.save(chmsChannel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("channel:chmschannel:update")
    public R update(@RequestBody ChmsChannelEntity chmsChannel){
		chmsChannelService.updateById(chmsChannel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("channel:chmschannel:delete")
    public R delete(@RequestBody Long[] ids){
		chmsChannelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
