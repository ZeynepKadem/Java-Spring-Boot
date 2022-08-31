package com.TemizlikSirketi.proje.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.TemizlikSirketi.proje.model.EmployeeModel;
import com.TemizlikSirketi.proje.model.PlanModel;
import com.TemizlikSirketi.proje.model.UserModel;


public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

	@Query(value = "SELECT * FROM employee u where u.name = ? and u.adress = ?;", nativeQuery = true)
    public UserModel findByEmployee(String name, String adress);

	 @Query(value = "SELECT * FROM employee u where u.id = ?;", nativeQuery = true)
	    public PlanModel getByid(Long id);



}
