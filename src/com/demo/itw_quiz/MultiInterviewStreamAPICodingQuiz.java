package com.demo.itw_quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.features.Employee1;

public class MultiInterviewStreamAPICodingQuiz {
	static List<Employee1> listEmployee = new ArrayList<Employee1>();
	
	static List<Employee1> vHR = new ArrayList<Employee1>();
	static List<Employee1> vSndM = new ArrayList<Employee1>();
	static List<Employee1> vInfra = new ArrayList<Employee1>();
	static List<Employee1> vProdDept = new ArrayList<Employee1>();
	static List<Employee1> vSecurity = new ArrayList<Employee1>();
	static List<Employee1> vAccountFinance = new ArrayList<Employee1>();
	static List<Employee1> vProdDev = new ArrayList<Employee1>();

	public static void main(String[] args) {
		listEmployee.add(new Employee1(188, "Amelia Joe", 31, "Female", "Product Development", 2015, 467528));

		listEmployee.add(new Employee1(111, "Jiya Brein", 32, "Female","HR", 2015, 135000));
		listEmployee.add(new Employee1(155, "Nima Roy", 27, "Female", "HR", 2016, 466252));
		
		listEmployee.add(new Employee1(255, "Sanvi Pandey", 23, "Male", "Infrastructure", 2018, 349737));
		listEmployee.add(new Employee1(133, "Martin Theron", 29, "Male", "Infrastructure", 2014, 328632));
		listEmployee.add(new Employee1(211, "Nitin Joshi", 27, "Male", "Infrastructure", 2014, 123752));

		listEmployee.add(new Employee1(233, "Nicolas Den", 27, "Male", "Account And Finance", 2013,902764));
		listEmployee.add(new Employee1(177, "Wang Liu", 35, "Male", "Account And Finance", 2010, 430987));

		listEmployee.add(new Employee1(166, "Manu Sharma", 43, "Male", "Security and Transport", 2015, 120003));
		listEmployee.add(new Employee1(200, "Jasna Kaur", 38, "Female", "Security and Transport", 2015, 438972));
		
		listEmployee.add(new Employee1(144, "Murli Gawda", 28, "Male", "Product Department", 2013, 239736));
		listEmployee.add(new Employee1(222, "Jyoti Reddy", 25, "Female", "Product Department", 2016, 128746));
		listEmployee.add(new Employee1(266, "Girija Shankar", 26, "Male", "Product Department", 2015, 298742));
		listEmployee.add(new Employee1(277, "Anuj Chettiyar", 31, "Male", "Product Department", 2012, 3760730));

		listEmployee.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales and Marketing", 2012, 149973));
		listEmployee.add(new Employee1(199, "Jordon Daugh", 24, "Male", "Sales And Marketing", 2016, 437628));
		listEmployee.add(new Employee1(244, "Ali Beg", 24, "Male", "Sales And Marketing",  2017, 2398478));

		//Query 1: How many male and female employee in the organization?
		getCountMaleAndFemaleEmployees();
		// Query 2: Print the name of all departments in the organization?
		getAllDepartmentNamesInOrg();
		
		// Query 3: What is the Average age of Male and female employees?
		getAverageAgeMaleAndFemales();
		// query 4 : Get the highest paid employee in company?
		getHighestPaidEmployee();

		// query 5 : Get the name of employees who joined after 2015?
		getEmployeesAfter2015();
		// query 6 : Count the number of employees in each department?

		// query 7 : get the youngest "male" employee in the Product Development
		
		
//		Query 10: Get the Lowest paid employee in company?
		getLowestPaidEmployee();
		
		vProdDev.add(listEmployee.get(0));
		
		vHR.add(listEmployee.get(1));
		vHR.add(listEmployee.get(2));
		
		vInfra.add(listEmployee.get(3));
		vInfra.add(listEmployee.get(4));
		vInfra.add(listEmployee.get(5));

		vAccountFinance.add(listEmployee.get(6));
		vAccountFinance.add(listEmployee.get(7));
		
		
		vSecurity.add(listEmployee.get(8));
		vSecurity.add(listEmployee.get(9));
		
		
		vProdDept.add(listEmployee.get(10));
		vProdDept.add(listEmployee.get(11));
		vProdDept.add(listEmployee.get(12));
		vProdDept.add(listEmployee.get(13));
		
		vSndM.add(listEmployee.get(14));
		vSndM.add(listEmployee.get(15));
		vSndM.add(listEmployee.get(16));
		
		
		Map<String, List<Employee1>> map = new HashMap<>();
		map.put("HR", vHR);
		map.put("Product Development", vAccountFinance);
		map.put("Sales and Marketing", vSndM);
		map.put("Infrastructure", vInfra);
		map.put("Product Department", vProdDept);
		map.put("Product Development", vProdDev);
		
		fun(map);
		
	}
	
	public static void getCountMaleAndFemaleEmployees(){
		System.out.println("Query 1: How many male and female employess all together exists in company?");
		Map<String, Long> collect = listEmployee.stream().
								collect(
											Collectors.groupingBy(Employee1::getGender, Collectors.counting())
								);
		System.out.println("======    "+collect);
	}
	
	public static void getAllDepartmentNamesInOrg() {
		System.out.println("Query 2: Get list of all departments in company?");
		listEmployee.stream().map(Employee1::getDeptName).distinct().forEach(System.out::println);
	}
	
	public static void getAverageAgeMaleAndFemales() {
		System.out.println("Query 3: Get the average age of male and female employees in company?");
		Map<String, Double> collect = listEmployee.stream()
				.collect(
							Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
		System.out.println("======    Average age of mail and female :"+collect);
	}
	
	public static void getHighestPaidEmployee() {
		System.out.println("Query 4: Get the highest paid employee in company?");
		Optional<Employee1> collect = listEmployee.stream()
				.collect(
							Collectors.maxBy(Comparator.comparing(Employee1::getSalary))
				);
		System.out.println("======    Highest paid employeeName :"+collect.get().getName()+" and salary is :"+collect.get().getSalary());
	}
	
	public static Map<String, Map<String, List<Employee1>>> fun(Map<String, List<Employee1>> map){	
		Stream<List<Employee1>> listEmployee = map.entrySet().stream().map(Map.Entry::getValue);
		System.out.println(listEmployee
									   .filter(
												e -> {
														String str = e.get(0).getName();
														System.out.println(str);
														return str.startsWith("P");
												}
											).collect(Collectors.toList()));
					return null;
	}
	
	
	public static void getLowestPaidEmployee() {
		System.out.println("Query 10: Get the Lowest paid employee in company?");
		List<Employee1> empsWithLowestSalary = listEmployee.stream()
			    .collect(
			    		Collectors.groupingBy(Employee1::getSalary, TreeMap::new, Collectors.toList())
			    		).firstEntry().getValue();
		System.out.println("======    1st way to get Lowest paid employeeName :"+empsWithLowestSalary.get(0).getName()+" and salary is :"+empsWithLowestSalary.get(0).getSalary());
		
		Optional<Employee1> collect = listEmployee.stream()
													.min(
															Comparator.comparing(Employee1::getSalary)
													);
		System.out.println("======    2nd way to get lowest paid employeeName :"+collect.get().getName()+" and salary is :"+collect.get().getSalary());
		
	}	
	
	public static void getEmployeesAfter2015() {
		System.out.println("Query 5 : Get the name of employees who joined after 2015?");
        List<String> map = listEmployee.stream().filter(e -> e.getSince()>2015).map(Employee1::getName).collect(Collectors.toList());
		System.out.println("Employees Joined After 2015 :"+map);
	}

}
	
