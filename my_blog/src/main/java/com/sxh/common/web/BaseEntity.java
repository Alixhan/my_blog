package com.sxh.common.web;

import java.util.Date;

import com.github.pagehelper.Page;

import lombok.Getter;
import lombok.Setter;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * @Description 所有实体都应继承此类
 * @author sunxiaohan
 * @date 2018-09-08
 */
@Setter@Getter
@NameStyle(Style.camelhumpAndLowercase)
public class BaseEntity <T>{

	/**
	 * 分页对象 默认为第一页 显示10条
	 */
	@Transient
	protected Page<T> page = new Page<T>(1,10);

	/**
	 * 主键id
	 */
	@Id
	protected Integer id; 
	protected Date createTime;
	protected Date updateTime;
}
