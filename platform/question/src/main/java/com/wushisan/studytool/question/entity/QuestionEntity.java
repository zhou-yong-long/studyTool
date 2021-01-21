package com.wushisan.studytool.question.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:43:14
 */
@Data
@TableName("qms_question")
public class QuestionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuestionEntity() {
	}

	public QuestionEntity(Long id, String title, String answer, Integer difficult, Integer displayOrder, String subTitle, Long subjectType, Integer enableShow, Integer delFlag, Date createTime, Date updateTime) {
		this.id = id;
		this.title = title;
		this.answer = answer;
		this.difficult = difficult;
		this.displayOrder = displayOrder;
		this.subTitle = subTitle;
		this.subjectType = subjectType;
		this.enableShow = enableShow;
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
	 * 题目标题
	 */
	private String title;
	/**
	 * 题目解答
	 */
	private String answer;
	/**
	 * 题目难度等级
	 */
	private Integer difficult;
	/**
	 * 排序
	 */
	private Integer displayOrder;
	/**
	 * 副标题
	 */
	private String subTitle;
	/**
	 * 题目类型
	 */
	private Long subjectType;
	/**
	 * 是否显示
	 */
	private Integer enableShow;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getDifficult() {
		return difficult;
	}

	public void setDifficult(Integer difficult) {
		this.difficult = difficult;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Long getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(Long subjectType) {
		this.subjectType = subjectType;
	}

	public Integer getEnableShow() {
		return enableShow;
	}

	public void setEnableShow(Integer enableShow) {
		this.enableShow = enableShow;
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
