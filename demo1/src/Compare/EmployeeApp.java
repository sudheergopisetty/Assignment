package Compare;

import java.util.*;

public class EmployeeApp {

	public static void main( String[] args) {
		boolean showEmpDetails = false;
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter first Employee details in the order of id, name, salary: ");
        emp1.empId = sc.nextInt();
        sc.nextLine();
        emp1.empName = sc.nextLine();
       
        emp1.salary = sc.nextInt();
        
        System.out.println("Enter second Employee details in the order of id, name, salary: ");
        emp2.empId = sc.nextInt();
        sc.nextLine();
        emp2.empName = sc.nextLine();
       
        emp2.salary = sc.nextInt();
        
        System.out.println(showEmpDetails);
        System.out.println("Do you want both the empolyee details to be printed in Console:(true/false)");
        showEmpDetails= sc.nextBoolean();
        System.out.println(showEmpDetails);
        sc.close();
        
        
        if(showEmpDetails) {
			System.out.println(emp1.empId);
			System.out.println(emp1.empName);
			System.out.println(emp1.salary);
			
			System.out.println(emp2.empId);
			System.out.println(emp2.empName);
			System.out.println(emp2.salary);
        }
		
		if (emp2.salary > emp1.salary) {
			System.out.println(emp2.empName +" has more salary then "+emp1.empName);
			
		}else if (emp2.salary == emp1.salary){
			System.out.println(emp1.empName +" and " + emp2.empName +" salary are same");
		} else {
			System.out.println(emp1.empName +" has more salary then "+emp2.empName);
		}
		
		emp1= null;
		emp2= null;
	}
	
}