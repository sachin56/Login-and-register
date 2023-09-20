package com.loginandregister.loginandregister.service;

import com.loginandregister.loginandregister.dto.EmployeeDTO;
import com.loginandregister.loginandregister.dto.LoginDTO;
import com.loginandregister.loginandregister.response.LoginResponse;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
