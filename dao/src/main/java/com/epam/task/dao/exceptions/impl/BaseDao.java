package com.epam.task.dao.exceptions.impl;

import com.epam.task.dao.IBaseDao;
import com.epam.task.dao.exceptions.DaoException;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Basic operations to any entities classes.
 * Implements Dao interface.
 * @param <T> object
 * @param <PK> primary key of object
 * Created by IPahomov on 27.06.2016.
 */
public class BaseDao<T, PK extends Serializable> implements IBaseDao<T, PK> {
    public PK save(T t) throws DaoException {
        return null;
    }

    public void update(T t) throws DaoException {

    }

    public T get(PK id) throws DaoException {
        return null;
    }

    public void delete(T t) throws DaoException {

    }

    private Class getPersistentClass(){
        return (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
