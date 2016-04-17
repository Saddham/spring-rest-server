package com.saddham.controller;

import com.saddham.domain.Employee;
import com.saddham.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by saddhamp on 18/3/16.
 */
@Controller
@RequestMapping(value="/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee get(@PathVariable("id") Long id){
        return employeeService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Long create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Employee employee){
        employeeService.update(employee);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id){
        employeeService.delete(id);
    }
}
