package com.sxh.web.entity;

import com.sxh.common.web.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

/**
 * @Description 用户实体类
 * @author sunxiaohan
 * @date 2018-09-08
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Table(name = "sys_user")
public class User extends BaseEntity<User> {
	private String name;
	private String sex;
	private String hobby;
}
