package com.learning.springboot.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface BaseService<T, Serializable> {

    int insert(T record);
    int insertSelective(T record);
    T selectByPrimaryKey(String id);
    int updateByPrimaryKey(T record);
    int updateByPrimaryKeySelective(T record);
    int deleteByPrimaryKey(String id);
    List<T> findTop(int top, String statementKey, Object parameter) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;
    T findTopOne(String statementKey, Object parameter) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException;
}
