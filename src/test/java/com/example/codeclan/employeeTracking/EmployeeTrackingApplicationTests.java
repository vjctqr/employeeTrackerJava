package com.example.codeclan.employeeTracking;

import com.example.codeclan.employeeTracking.models.Employee;
import com.example.codeclan.employeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackingApplicationTests {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void createEmployee(){
		Employee employee1 = new Employee("Bob Ross", 56, 001, "happyAccident@paint.org");
		employeeRepository.save(employee1);
	}

}
