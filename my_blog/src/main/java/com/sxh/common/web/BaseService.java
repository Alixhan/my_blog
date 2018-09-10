package com.sxh.common.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
/**
 * @Description 基础service
 * @author 孙小寒
 * @date 2018-09-08
 */
@Service
public class BaseService <T extends BaseEntity<T>> {
	
	@Autowired
	protected BaseDao<T> baseDao;
	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	/**
	 * @Description 通过id获取实体
	 * @authorDate 孙小寒  2018-09-08
	 */
	public T get(Integer id){
		return baseDao.get(id);
	}
	
	/**
	 * @Description 添加实体
	 * @authorDate 孙小寒  2018-09-08
	 */
	@Transactional(rollbackFor=Exception.class)
	public void add(T entity) {
		baseDao.add(entity);
	}
	
	/**
	 * @Description  更新实体
	 * @authorDate 孙小寒  2018-09-08
	 */
	@Transactional(rollbackFor=Exception.class)
	public void update(T entity) {
		baseDao.update(entity);
	}
	
	/**
	 * @Description 删除实体
	 * @authorDate 孙小寒  2018-09-08
	 */
	@Transactional(rollbackFor=Exception.class)
	public void delete(T entity) {
		baseDao.delete(entity);
	}
	
	/**
	 * @Description 获取列表数据
	 * @authorDate 孙小寒  2018-09-08
	 */
	public List<T> findList(T entity){
		return baseDao.findList(entity);
	}
	
	/**
	 * @Description  获取分页数据
	 * @authorDate 孙小寒  2018-09-08
	 */
	public Page<T> findPage(T entity){
		Page<T> page = entity.getPage();
		page = PageHelper.startPage(page.getPageNum(),page.getPageSize());
		baseDao.findList(entity);
		return page;
	}
}
