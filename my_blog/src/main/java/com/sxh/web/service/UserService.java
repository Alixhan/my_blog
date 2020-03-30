package com.sxh.web.service;

import com.sxh.common.web.BaseService;
import com.sxh.web.dao.UserDao;
import com.sxh.web.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Description UserService
 * @author sunxiaohan
 * @date 2018-09-08
 */
@Service("userService")
public class UserService extends BaseService<User> {

	@Resource
	private UserDao userDao;
	
	public Map<String, Object> excuteSql() {
		Map<String, Object> maps = jdbcTemplate.queryForMap("select * from user where id = ?",1);
		return maps;
	}
}
