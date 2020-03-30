package com.sxh.common.web;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
 * @Description 基础service
 * @author sunxiaohan
 * @date 2018-09-08
 */
@Service
public class BaseService <T extends BaseEntity<T>> {
	
	@Resource
	protected BaseDao<T> baseDao;
	@Resource
	protected JdbcTemplate jdbcTemplate;

	/**
	 * @Description 通过id获取实体
	 * @authorDate sunxiaohan  2018-09-08
	 */
	public T get(Integer id){
		T entity = baseDao.selectByPrimaryKey(id);
		return entity;
	}

	/**
	 * @Description 插入实体
	 * @authorDate sunxiaohan  2018-09-08
	 */
	@Transactional(rollbackFor=Exception.class)
	public void add(T entity) {
		baseDao.insert(entity);
	}

	/**
	 * @Description  更新实体
	 * @authorDate sunxiaohan  2018-09-08
	 */
	@Transactional(rollbackFor=Exception.class)
	public void update(T entity) {
		baseDao.updateByPrimaryKey(entity);
	}

	/**
	 * @Description 删除实体
	 * @authorDate sunxiaohan  2018-09-08
	 */
	@Transactional(rollbackFor=Exception.class)
	public void delete(T entity) {
		baseDao.delete(entity);
	}

	/**
	 * @Description 获取列表数据
	 * @authorDate sunxiaohan  2018-09-08
	 */
	public List<T> findAllList(T entity){
		return baseDao.selectAll();
	}

	/**
	 * @Description  获取分页数据
	 * @authorDate sunxiaohan  2018-09-08
	 */
	public Page<T> findPage(T entity){
		Page<T> page = entity.getPage();
		page = PageHelper.startPage(page.getPageNum(),page.getPageSize(),null);
		baseDao.selectAll();
		return page;
	}
}
