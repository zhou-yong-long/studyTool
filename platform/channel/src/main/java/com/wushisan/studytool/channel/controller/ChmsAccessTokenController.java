package com.wushisan.studytool.channel.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wushisan.studytool.channel.entity.ChmsAccessTokenEntity;
import com.wushisan.studytool.channel.service.ChmsAccessTokenService;
import utils.PageUtils;
import utils.R;



/**
 * 渠道-认证表
 *
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-19 16:55:20
 */
@CrossOrigin
@RestController
@RequestMapping("channel/chmsaccesstoken")
public class ChmsAccessTokenController {
    @Autowired
    private ChmsAccessTokenService chmsAccessTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")

    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = chmsAccessTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("channel:chmsaccesstoken:info")
    public R info(@PathVariable("id") Long id){
		ChmsAccessTokenEntity chmsAccessToken = chmsAccessTokenService.getById(id);

        return R.ok().put("chmsAccessToken", chmsAccessToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("channel:chmsaccesstoken:save")
    public R save(@RequestBody ChmsAccessTokenEntity chmsAccessToken){
		chmsAccessTokenService.save(chmsAccessToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("channel:chmsaccesstoken:update")
    public R update(@RequestBody ChmsAccessTokenEntity chmsAccessToken){
		chmsAccessTokenService.updateById(chmsAccessToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("channel:chmsaccesstoken:delete")
    public R delete(@RequestBody Long[] ids){
		chmsAccessTokenService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
