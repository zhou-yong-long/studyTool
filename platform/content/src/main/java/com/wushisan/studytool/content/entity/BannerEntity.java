package com.wushisan.studytool.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 内容-横幅广告表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 10:52:35
 */
@Data
@TableName("cms_banner")
public class BannerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BannerEntity() {
	}

	public BannerEntity(Long id, String imgUrl, String title, Integer displayOrder, Integer enableShow, Integer renderType, String renderUrl, Integer delFlag, Date createTime, Date updateTime) {
		this.id = id;
		this.imgUrl = imgUrl;
		this.title = title;
		this.displayOrder = displayOrder;
		this.enableShow = enableShow;
		this.renderType = renderType;
		this.renderUrl = renderUrl;
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
	 * 图片路径
	 */
	private String imgUrl;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 排序
	 */
	private Integer displayOrder;
	/**
	 * 是否显示
	 */
	private Integer enableShow;
	/**
	 * 跳转类型
	 */
	private Integer renderType;
	/**
	 * 跳转路径
	 */
	private String renderUrl;
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

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Integer getEnableShow() {
		return enableShow;
	}

	public void setEnableShow(Integer enableShow) {
		this.enableShow = enableShow;
	}

	public Integer getRenderType() {
		return renderType;
	}

	public void setRenderType(Integer renderType) {
		this.renderType = renderType;
	}

	public String getRenderUrl() {
		return renderUrl;
	}

	public void setRenderUrl(String renderUrl) {
		this.renderUrl = renderUrl;
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
