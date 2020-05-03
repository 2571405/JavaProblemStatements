/*
*Employee Wage Computation Program
*using instance method and instance variables
*@author Moutusi Karmakar
*/
import java.util.Random;
import java.util.*;
//Employee class
class Employee{
//Constants
private static final int IS_PART_TIME = 0;
private static final int IS_FULL_TIME = 1;
private int numOfCompany = 0;
private List<CompanyEmpWage> companyEmpWageArray;

/*
*Constructor Employee
*/
public Employee(){
	companyEmpWageArray = new ArrayList<CompanyEmpWage>();
}

	public void addCompanyEmpWage(String compName, int numOfDays, int empRate, int maxHrs){
		CompanyEmpWage obj = new CompanyEmpWage(compName, numOfDays, empRate, maxHrs);
		companyEmpWageArray.add(obj);
	}
	/*
	*method that gives the total number of companies for which wages are calculated
	*/
	public int totalCompanies(){
		return companyEmpWageArray.size();
	}

	/*
	*method getType returns the employee hours per day according to type of employee
	*@param type
	*/
	public int getType(int type){
		int empHrs = 0;
		if(type == IS_PART_TIME){
			System.out.println("PART TIME EMPLOYEE");
      	empHrs = 4;
  		}
   	if(type == IS_FULL_TIME){
      	System.out.println("FULL TIME EMPLOYEE");
      	empHrs = 8;
   	}
		return empHrs;
	}



	  /*Method for calculating monthly wage of employee based on type (part time/ full time)
	  *calculates salary according to the attendance of the employee
	  */
     public void calculateEmpWage(int empHrs){
     int totalWorkingDays = 1;
	  int totalWorkingHours = 0;
	  /*
	  *varable empAttendance tells if emp is present '0' or absent '1' on that day of the month
	  */
	  int empAttendance;
	  /*
	  *variable monthlyWage stores the monthly wage of the employee
	  */
     int monthlyWage = 0;
	  /*
	  *variable daysPresent keeps count of the no of days present for a month
		*/
	  int daysPresent = 0;
	  /*
	  *variable hoursWorked keeps count of the no of hours worked in a month
	  */
	  int hoursWorked = 0;

	  while(true){
		 	 Random rand = new Random();
          empAttendance = rand.nextInt(2);
          if(empAttendance == 0){
              daysPresent += 1;
              System.out.println("Day "+totalWorkingDays+": Present");
              monthlyWage += CompanyEmpWage.getempRate() * empHrs;
              hoursWorked += empHrs;
          }
          else{
              System.out.println("Day "+totalWorkingDays+": Absent");
              monthlyWage += 0;
              hoursWorked += 0;
          }
          if(totalWorkingDays == CompanyEmpWage.getnumOfDays()  || !(totalWorkingHours < CompanyEmpWage.getmaxHrs())){
              if(totalWorkingDays == CompanyEmpWage.getnumOfDays()){
                   System.out.println(CompanyEmpWage.getnumOfDays()+" days are over!");
                   break;
              }
              else{
                   System.out.println(CompanyEmpWage.getmaxHrs()+" hours reached!");
                   break;
              }
          }
	  	totalWorkingDays++;
      totalWorkingHours += empHrs;
       }
      System.out.println("Company: "+CompanyEmpWage.getcompName()+"\nNo of days worked out of "+CompanyEmpWage.getnumOfDays()+" days: "+daysPresent+"\nNo of hours worked out of "+CompanyEmpWage.getmaxHrs()+" hours: "+hoursWorked+"\nSalary for the month: "+monthlyWage);
      }
}
/*
*Employee wage program class
*/
public class EmployeeWageProgram{
     /*
     *Main method
     *@param s
     */
      public static void main(String []s){
			/*
			*dayPrHr stores the working hours per day according to type
			*/
			int dayPrHr;
			/*
			*empType stores the type of employee (part time or full time)
			*/
			int empType;
			Random rand = new Random();
			Employee emp = new Employee();
	   	emp.addCompanyEmpWage("BridgeLabz",20,20,100);
			empType = rand.nextInt(2);
			dayPrHr = emp.getType(empType);
			emp.calculateEmpWage(dayPrHr);
	   	emp.addCompanyEmpWage("DMart",25,15,150);
			empType = rand.nextInt(2);
         dayPrHr = emp.getType(empType);
			emp.calculateEmpWage(dayPrHr);
	   	emp.addCompanyEmpWage("Big Basket",20,25,100);
			empType = rand.nextInt(2);
         dayPrHr = emp.getType(empType);
			emp.calculateEmpWage(dayPrHr);
			System.out.println("No of companies added: "+emp.totalCompanies());
      }
}
