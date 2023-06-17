package com.atguigu.restful.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDao<T> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 增删改操作
     *
     * @param sql  预编译sql语句
     * @param args 占位符参数
     * @return 影响行数
     */
    public int urdOption(String sql, Object... args) {
        return jdbcTemplate.update(sql, args);
    }

    /**
     * 查单个结果
     *
     * @param clazz 数据载体对象的Class
     * @param sql   预编译sql语句
     * @param args  占位符参数
     * @return 数据载体对象
     */
    public T cObjOption(Class<T> clazz, String sql, Object... args) {
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(clazz), args);
    }

    /**
     * 查多个结果
     *
     * @param clazz 数据载体对象的Class
     * @param sql   预编译sql语句
     * @param args  占位符参数
     * @return 数据载体对象
     */
    public List<T> cListOption(Class<T> clazz, String sql, Object... args) {
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(clazz), args);
    }
}
