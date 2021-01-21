package com.wushisan.studytool.study.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学习-用户学习时常表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:55:00
 */
@Data
@TableName("sms_study_time")
public class StudyTimeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public StudyTimeEntity() {
	}

	public StudyTimeEntity(Long id, Long quesType, Long memberId, Integer totalTime, Integer delFlag, Date createTime, Date updateTime) {
		this.id = id;
		this.quesType = quesType;
		this.memberId = memberId;
		this.totalTime = totalTime;
		this.delFlag = delFlag;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 题目类型id
	 */
	private Long quesType;
	/**
	 * 用户id
	 */
	private Long memberId;
	/**
	 * 学习时常（分）
	 */
	private Integer totalTime;
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

	public Long getQuesType() {
		return quesType;
	}

	public void setQuesType(Long quesType) {
		this.quesType = quesType;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(Integer totalTime) {
		this.totalTime = totalTime;
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
