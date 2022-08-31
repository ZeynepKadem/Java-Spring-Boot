package com.TemizlikSirketi.proje.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TemizlikSirketi.proje.model.EmployeeModel;

import com.TemizlikSirketi.proje.repository.EmployeeRepository;
import com.TemizlikSirketi.proje.repository.HomeRepository;
import com.TemizlikSirketi.proje.service.EmployeeService;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<EmployeeModel> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeModel saveEmployee(EmployeeModel employeeModel) {
		return employeeRepository.save(employeeModel);
	}

	@Override
	public EmployeeModel getEmployeeById(Long id) {
		return employeeRepository.getById(id);
	}

	@Override
	public EmployeeModel updateEmployee(EmployeeModel employeeModel) {
		return employeeRepository.save(employeeModel);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

}
