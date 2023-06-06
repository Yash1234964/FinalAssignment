package in.ineuron.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	
	public void saveEmployee() {
		System.out.println("Employee Saved");
	}
	
	public void getEmployee() {
		System.out.println("Get employee from database");
	}
	
}
