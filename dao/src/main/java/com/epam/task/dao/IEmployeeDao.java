package com.epam.task.dao;

import com.epam.task.dao.exceptions.DaoException;
import com.epam.task.models.Employee;

import java.util.Calendar;
import java.util.List;

/**
 * Created by IPahomov on 28.06.2016.
 */
public interface IEmployeeDao extends IBaseDao<Employee, Long> {
    List getEmployeesByBirhday(Calendar calendar) throws DaoException;

    List<Employee> getEmployeesBetweenDates(Calendar from, Calendar to) throws DaoException;


}
