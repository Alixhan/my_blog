package com.sxh.common.web;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Description BaseDao
 * @author 孙小寒
 * @date 2018-09-08
 */
@Mapper
public interface BaseDao <T extends BaseEntity<T>>{
	
	/**
	 * id获取实体
	 * @authorDate 孙小寒  2018-09-08 
	 * @param id
	 * @return T
	 */
	T get(Integer id);
	
	/**
	 * 添加实体
	 * @authorDate 孙小寒  2018-09-08 
	 * @param entity void
	 */
	void add(T entity);
	
	/**
	 * 更新实体
	 * @authorDate 孙小寒  2018-09-08 
	 * @param entity void
	 */
	void update(T entity);
	
	/**
	 * 删除实体
	 * @authorDate 孙小寒  2018-09-08 
	 * @param entity void
	 */
	void delete(T entity);
	
	/**
	 * 获取列表数据
	 * @authorDate 孙小寒  2018-09-08 
	 * @param entity
	 * @return List<T>
	 */
	List<T> findList(T entity);
}
