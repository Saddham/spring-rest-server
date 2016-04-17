package com.saddham.service;

import com.saddham.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by saddhamp on 18/3/16.
 */
@Service
public interface EmployeeService {
    public List<Employee> getAll();
    public Employee get(Long id);
    public Long create(Employee employee);
    public void delete(Long id);
    public void update(Employee employee);
}
