package SpringAssignment1.springAssignment1;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class question1 {
	
	private Map<String, String> employees;
	
	public question1(Map<String, String> employees) {
		this.employees = employees;
	}

	public question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Map<String, String> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<String, String> employees) {
		this.employees = employees;
	}

	public void display() {
		for(Map.Entry<String, String> entry: employees.entrySet()) {
			System.out.println("Employee ID: "+entry.getKey()+"\nName: "+entry.getValue()+"\n");
		}
	}
	
}