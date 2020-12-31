package com.javaerror.aws.employee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
@Transactional
public interface EmployeeDAO extends CrudRepository<Employee,Integer>{

	@Query(nativeQuery = true,value = "call getEmployee")
    List<Employee> getEmployeeList();
	
}
