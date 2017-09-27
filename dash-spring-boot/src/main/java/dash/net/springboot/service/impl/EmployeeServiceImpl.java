package dash.net.springboot.service.impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import dash.net.springboot.model.Employee;
import dash.net.springboot.service.EmployeeService;
@Service(value="employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	private List<Employee> employees = new ArrayList<Employee>(Arrays.asList(new Employee(100l, "Arunabh Dash", "dasharunabh@gmail.com"),new Employee(101l, "Ankita Dash", "dashankita@gmail.com")));
	public List<Employee> getEmployees() {
		return this.employees;
	}
	public Employee getEmployeeById(Long id) {
		for(Employee emp:employees){
			if (emp.getId().equals(id))
				return emp;
		}
		return null;
	}
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	public void updateEmployee(Employee employee,Long id){
		Iterator<Employee> itr=employees.iterator();
		for(Employee emp:employees){
			if (emp.getId().equals(id)){
				employees.set(employees.indexOf(emp), employee);
				break;
			}
		}
		/*while(itr.hasNext()){
			Employee emp=(Employee)itr.next();
			if(emp.getId().equals(id)){
				emp=employee;
			}
		}*/
	}
	public void deleteEmployee(Long id){
		Employee employee=null;
		for(Employee emp:employees){
			if (emp.getId().equals(id))
			{
				employee=emp;
				break;
			}
		}
		if(employee!=null)
		employees.remove(employee);
	}
}

