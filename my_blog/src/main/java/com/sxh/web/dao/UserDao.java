package com.sxh.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.sxh.common.web.BaseDao;
import com.sxh.web.entity.User;

/**
 * @Description UserDao
 * @author 孙小寒
 * @date 2018-09-08
 */
@Mapper
public interface UserDao extends BaseDao<User> {
}
