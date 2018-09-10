package com.sxh.web.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxh.common.web.BaseService;
import com.sxh.web.dao.UserDao;
import com.sxh.web.entity.User;

/**
 * @Description UserService
 * @author 孙小寒
 * @date 2018-09-08
 */
@Service("userService")
public class UserService extends BaseService<User> {

	@Autowired
	private UserDao userDao;
	
	public Map<String, Object> excuteSql() {
		Map<String, Object> maps = jdbcTemplate.queryForMap("select * from user where id = ?",1);
		return maps;
	}
}
