package com.wushisan.studytool.channel.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 渠道-渠道表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-19 16:55:20
 */
@Data
@TableName("chms_channel")
public class ChmsChannelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChmsChannelEntity() {
	}

	public ChmsChannelEntity(Long id, String name, String appid, String appsecret, Integer delFlag, Date createTime, Date updateTime) {
		this.id = id;
		this.name = name;
		this.appid = appid;
		this.appsecret = appsecret;
		this.delFlag = delFlag;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 渠道名称
	 */
	private String name;
	/**
	 * 渠道appid
	 */
	private String appid;
	/**
	 * 渠道appsecret
	 */
	private String appsecret;
	/**
	 * 删除标记（0-正常，1-删除）
	 */
	private Integer delFlag;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
