package dash.net.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import dash.net.springboot.model.*;
import dash.net.springboot.service.EmployeeService;


@RestController
public class EmployeeController { 
	
	private final Log log = LogFactory.getLog(getClass());
	@Autowired
    private  EmployeeService employeeService;

	/**
	 * Returns the list of Employees . It uses GET method (RequestMethod.GET) since it will take default value for RequestMethod.GET.
	 * The standard form of url pattern for retrieving all the employees is /employees and it should use GET METHOD. 
	 * @return		List<Employee> 
	 */
    @RequestMapping("/employees")
    public List<Employee> getEmployees() {
    	return employeeService.getEmployees();
    }
    /**
     * Returns the Employee who is having id sent by the path variable . 
     * If the @PathVariable names are not the same then we can map it by passing the name in the constructor as @PathVariable("empId")
     * The standard form of url pattern for retrieving an employee with specific id is /employees/id and it should use GET METHOD. 
     * @param id	-	id of the employee	
     * @return		- 	Employee object with the specific 
     */
    @RequestMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
    	return employeeService.getEmployeeById(id);
    }  
    /**
     * This method adds the employee whose details are sent in the request . By default the RequestBody is of application/json type.
     * @param employee
     */
    @RequestMapping(value="/employees",method=RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee) {
    	employeeService.addEmployee(employee);
    }
    
    
    /**
     * This method adds the employee whose details are sent in the request . By default the RequestBody is of application/json type.
     * @param employee
     */
    @RequestMapping(value="/employees/{id}",method=RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee,@PathVariable Long id ) {
    	employeeService.updateEmployee(employee, id);
    }
    
    /**
     * This method adds the employee whose details are sent in the request . By default the RequestBody is of application/json type.
     * @param employee
     */
    @RequestMapping(value="/employees/{id}",method=RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Long id ) {
    	employeeService.deleteEmployee(id);
    }
    
    
    
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public void addEmployee(@RequestParam(value = "employeeName", required = false) String employeeName,
    		@RequestParam(value = "employeeId", required = false) String employeeId,
    		@RequestParam(value = "employeeCity", required = false) String employeeCity){
    	log.info("Coming to the add Employee :"+employeeName);
    }
    @RequestMapping(value="/addNum",method = RequestMethod.GET)
    public String addNumber(@RequestParam(value = "num1", required = false)String num1 ,@RequestParam(value = "num2", required = false)String num2  ){
    	log.info("Coming to the add Employee :"+Integer.parseInt(num1)+ Integer.parseInt(num2));
    	return Integer.toString(Integer.parseInt(num1)+ Integer.parseInt(num2));
    }
    @RequestMapping(value="/substractNum",method = RequestMethod.GET)
    public String substractNumber(@RequestParam(value = "num1", required = false)String num1 ,@RequestParam(value = "num2", required = false)String num2  ){
    	log.info("Coming to the add Employee :"+(Integer.parseInt(num1)- Integer.parseInt(num2)));
    	return Integer.toString(Integer.parseInt(num1)- Integer.parseInt(num2));
    }

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
}
