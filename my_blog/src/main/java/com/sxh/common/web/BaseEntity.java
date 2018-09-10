package com.sxh.common.web;

import java.util.Date;

import com.github.pagehelper.Page;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 所有实体都应继承此类
 * @author 孙小寒
 * @date 2018-09-08
 */
@Setter@Getter
public class BaseEntity <T>{
	
	/**
	 * 分页对象 默认为第一页 显示10条
	 */
	protected Page<T> page = new Page<T>(1,10); 
	/**
	 * 主键id
	 */
	protected Integer id; 
	protected Date createDate;
	protected Date updateDate;
}
