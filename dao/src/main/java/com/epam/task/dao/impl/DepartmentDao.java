package com.epam.task.dao.impl;

import com.epam.task.dao.IDepartmentDao;
import com.epam.task.dao.exceptions.DaoException;
import com.epam.task.models.Department;

import java.util.List;

/**
 * Created by IPahomov on 29.06.2016.
 */
public class DepartmentDao extends BaseDao<Department, Long> implements IDepartmentDao {
    public List<Department> getAllDepartments() throws DaoException {
        return getSession().createCriteria(Department.class).list();
    }
}
