package dash.net.springboot.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController { 
	
	private final Log log = LogFactory.getLog(getClass());

    /*private final EmployeeService employeeService;

    @Inject
    public EmployeeController(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> listEmployees() {
        List<Employee> employees = employeeService.getList();
        return employees;
    }*/
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public void addEmployee(@RequestParam(value = "employeeName", required = false) String employeeName,
    		@RequestParam(value = "employeeId", required = false) String employeeId,
    		@RequestParam(value = "employeeCity", required = false) String employeeCity){
    	log.info("Coming to the add Employee :"+employeeName);
    	//Employee employee = new Employee(employeeId,employeeName,employeeCity);
    	//employeeService.save(employee);
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
}
