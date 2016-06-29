package com.epam.task.dao.impl;

import com.epam.task.dao.IEmployeeDao;
import com.epam.task.dao.exceptions.DaoException;
import com.epam.task.models.Employee;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

/**
 * Class for database operations with employees.
 * Extends BaseDao and implements IEmployeeDao
 * Created by IPahomov on 28.06.2016.
 */
@Repository("emploeeDao")
public class EmployeeDao extends BaseDao<Employee, Long> implements IEmployeeDao {
    final static Logger logger = Logger.getLogger(EmployeeDao.class);

    public List<Employee> getEmployeesByBirhday(Calendar calendar) throws DaoException {
        Criteria criteria = getSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("birthday", calendar));
        return (List<Employee>) criteria.list();
    }

    public List<Employee> getEmployeesBetweenDates(Calendar from, Calendar to) throws DaoException {
        Criteria criteria = getSession().createCriteria(Employee.class);
        criteria.addOrder(Order.asc("birhday"));
        criteria.add(Restrictions.between("birthday", from, to));
        return (List<Employee>) criteria.list();
    }
}
