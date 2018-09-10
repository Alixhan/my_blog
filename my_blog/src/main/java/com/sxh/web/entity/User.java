package com.sxh.web.entity;

import com.sxh.common.web.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Description 用户实体类
 * @author 孙小寒
 * @date 2018-09-08
 */
@Setter@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity<User> {
	
	private String name;
	private String sex;
	private String hobby;
	
	
}
