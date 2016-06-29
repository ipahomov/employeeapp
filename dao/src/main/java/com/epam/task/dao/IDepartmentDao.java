package com.epam.task.dao;

import com.epam.task.dao.exceptions.DaoException;
import com.epam.task.models.Department;

import java.util.List;

/**
 * Created by IPahomov on 28.06.2016.
 */
public interface IDepartmentDao extends IBaseDao<Department, Long> {

    List<Department> getAllDepartments() throws DaoException;
}
