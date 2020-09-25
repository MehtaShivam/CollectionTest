import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<ArrayList<Employee>> {
	private String name;
	private int age;
	private int salary;
	private String joiningDate;
	
	public Employee (int age, String name, int salary, String joiningDate) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	@Override
	public int compareTo(ArrayList<Employee> o) {
		// TODO Auto-generated method stub
		return this.age -  o.get(0).getAge();
	}

}

class salaryCompare implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary() < e2.getSalary()) {
			return -1;
		}
		else if (e1.getSalary() > e2.getSalary()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}

class nameCompare implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getName().compareTo(e2.getName()) < 1) {
			return -1;
		}
		else if (e1.getName().compareTo(e2.getName()) > 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}

class joiningDateCompare implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getJoiningDate().compareTo(e2.getJoiningDate()) < 1) {
			return -1;
		}
		else if (e1.getJoiningDate().compareTo(e2.getJoiningDate()) > 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}

class EmployeeExample{
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>(); 
		list.add(new Employee(55, "Jane Doe", 1111, "Jan 1, 2020")); 
		list.add(new Employee(22, "Adam Smith", 2222, "April 22, 2020"));
		list.add(new Employee(1, "John Johnson", 1500, "April 31, 2020"));
		list.add(new Employee(33, "David James", 900, "June 6, 2020"));
		list.add(new Employee(12, "Ashley William", 1900, "July 15, 2020"));

		Comparator c =  new salaryCompare();
		
		Collections.sort(list, c);
		
		for (Employee e3: list) {
			System.out.println(e3.getName());
		}
		
		Comparator d =  new nameCompare();
		
		Collections.sort(list, d);
		
		for (Employee e2: list) {
			System.out.println(e2.getName());
		}
		
		Comparator e =  new joiningDateCompare();
		
		Collections.sort(list, e);
		
		for (Employee e1: list) {
			System.out.println(e1.getName());
		}
	}
}

