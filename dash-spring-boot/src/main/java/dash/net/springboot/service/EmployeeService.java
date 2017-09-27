package dash.net.springboot.service;

import java.util.List;
import java.util.Set;

import dash.net.springboot.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	public Employee getEmployeeById(Long id);
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee,Long id);
	public void deleteEmployee(Long id);
	
}
