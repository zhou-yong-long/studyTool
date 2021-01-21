package com.wushisan.studytool.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员-会员表
 * 
 * @author wushisan
 * @email 809545115@qq.com
 * @date 2021-01-20 17:32:45
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MemberEntity() {
	}

	public MemberEntity(Long id, Integer miniOpenid, String mpOpenid, String unionid, String userName, String password, String nickname, String phone, String email, String avatar, Integer gender, Date birth, String city, Integer sourceType, Date registerTime, Integer delFlag, Date createTime, Date updateTime) {
		this.id = id;
		this.miniOpenid = miniOpenid;
		this.mpOpenid = mpOpenid;
		this.unionid = unionid;
		this.userName = userName;
		this.password = password;
		this.nickname = nickname;
		this.phone = phone;
		this.email = email;
		this.avatar = avatar;
		this.gender = gender;
		this.birth = birth;
		this.city = city;
		this.sourceType = sourceType;
		this.registerTime = registerTime;
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
	 * 小程序openid
	 */
	private Integer miniOpenid;
	/**
	 * 服务号openid
	 */
	private String mpOpenid;
	/**
	 * 微信unionid
	 */
	private String unionid;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 手机号码
	 */
	private String phone;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 生日
	 */
	private Date birth;
	/**
	 * 所在城市
	 */
	private String city;
	/**
	 * 用户来源
	 */
	private Integer sourceType;
	/**
	 * 注册时间
	 */
	private Date registerTime;
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

	public Integer getMiniOpenid() {
		return miniOpenid;
	}

	public void setMiniOpenid(Integer miniOpenid) {
		this.miniOpenid = miniOpenid;
	}

	public String getMpOpenid() {
		return mpOpenid;
	}

	public void setMpOpenid(String mpOpenid) {
		this.mpOpenid = mpOpenid;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getSourceType() {
		return sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
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
