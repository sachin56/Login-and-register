package com.loginandregister.loginandregister.service;

import com.loginandregister.loginandregister.dto.EmployeeDTO;
import com.loginandregister.loginandregister.dto.LoginDTO;
import com.loginandregister.loginandregister.entity.Employee;
import com.loginandregister.loginandregister.response.LoginResponse;

import java.util.List;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);

    List<Employee> findAll();

    String deleteEmployee(int empID);

    Employee searchEmployee(int empID);
}
