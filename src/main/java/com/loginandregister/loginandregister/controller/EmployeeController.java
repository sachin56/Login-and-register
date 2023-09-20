package com.loginandregister.loginandregister.controller;

import com.loginandregister.loginandregister.dto.EmployeeDTO;
import com.loginandregister.loginandregister.dto.LoginDTO;
import com.loginandregister.loginandregister.response.LoginResponse;
import com.loginandregister.loginandregister.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
         String id = employeeService.addEmployee(employeeDTO);
         return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
