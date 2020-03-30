package com.sxh.common.web;

import tk.mybatis.mapper.common.Mapper;


/**
 * @Description BaseDao
 * @author sunxiaohan
 * @date 2018-09-08
 */
public interface BaseDao <T extends BaseEntity<T>> extends Mapper<T> {
}
