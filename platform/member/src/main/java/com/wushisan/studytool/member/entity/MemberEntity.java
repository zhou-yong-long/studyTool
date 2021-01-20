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

}
