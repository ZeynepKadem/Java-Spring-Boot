package com.TemizlikSirketi.proje.service;

import java.util.List;

import com.TemizlikSirketi.proje.model.EmployeeModel;


public interface EmployeeService {

	List<EmployeeModel> getAllHome();
	EmployeeModel saveEmployee(EmployeeModel employeeModel);
	EmployeeModel getEmployeeById(Long id);
	EmployeeModel updateEmployee(EmployeeModel employeeModel);
    void deleteEmployeeById(Long id);
    List<EmployeeModel> getEmployeeByDone(boolean done);
    EmployeeModel getEmployeeByAdress(String adress);
    EmployeeModel getEmployeeByid(Long id);
	List<EmployeeModel> getAllEmployee();
	
	
}
