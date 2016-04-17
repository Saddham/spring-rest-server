package com.saddham.service;

import com.saddham.domain.Employee;
import com.saddham.service.EmployeeService;

import java.util.*;

/**
 * Created by saddhamp on 18/3/16.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private static final Map<Long, Employee> employeeDB = new HashMap<Long, Employee>();
    private static long employeeSequence = 0L;
    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<Employee>(employeeDB.size());
        Set<Long> keySet = employeeDB.keySet();
        Iterator<Long> itr = keySet.iterator();
        while (itr.hasNext()){
            employeeList.add(employeeDB.get(itr.next()));
        }

        return employeeList;
    }

    @Override
    public Employee get(Long id) {
        return employeeDB.get(id);
    }

    @Override
    public Long create(Employee employee) {
        employeeSequence += 1L;
        employee.setId(employeeSequence);
        employeeDB.put(employee.getId(), employee);
        return employee.getId();
    }

    @Override
    public void delete(Long id) {
        employeeDB.remove(id);
    }

    @Override
    public void update(Employee employee) {
        employeeDB.put(employee.getId(), employee);
    }
}
