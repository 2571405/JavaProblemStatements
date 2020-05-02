/*
*Employee Wage Computation Program
*using instance method and instance variables
*@author Moutusi Karmakar
*/
import java.util.Random;
import java.util.*;
//Employee Wage class
public class EmployeeWageProgram{
//Constants
private static final int IS_PART_TIME = 0;
private static final int IS_FULL_TIME = 1;
private int numOfCompany = 0;
private List<CompanyEmpWage> companyEmpWageArray;

//Constructor
public EmployeeWageProgram(){
	companyEmpWageArray = new ArrayList<CompanyEmpWage>();
}

public void addCompanyEmpWage(String compName, int numOfDays, int empRate, int maxHrs){
	CompanyEmpWage obj = new CompanyEmpWage(compName, numOfDays, empRate, maxHrs);
	companyEmpWageArray.add(obj);
}

public int totalCompanies(){
	return companyEmpWageArray.size();
}

	/*
	*Method for calculating monthly wage of employee based on type (part time/ full time)
	*calculates salary according to the attendance of the employee
	*/
     private void calculateEmpWage(){
     Object totalWorkingDays = 1;
	  Object totalWorkingHours = 0;
     //variable empType tells the type of employee i.e., part time/full time
	  int empType;
	  //variable empHrs fetches the no of work hours per day according to type of employee
	  Object empHrs = 0;
	  //varable empAttendance tells if emp is present '0' or absent '1' on that day of the month
	  int empAttendance;
     int monthlyWage = 0;
	  //variable daysPresent keeps count of the no of days present for a month
	  int daysPresent = 0;
	  //variable hoursWorked keeps count of the no of hours worked in a month
	  int hoursWorked = 0;
	  Random rand = new Random();
	  empType = rand.nextInt(2);
	  switch(empType){
	  case IS_PART_TIME:
		System.out.println("PART TIME EMPLOYEE");
		empHrs = 4;
	  break;
	  case IS_FULL_TIME:
		System.out.println("FULL TIME EMPLOYEE");
		empHrs = 8;
	  break;
	  default:
	        System.out.println(" ");
	  break;
	  }
		Object CN = companyEmpWageArray.get(0);
		Object ND = companyEmpWageArray.get(1);
		Object ER = companyEmpWageArray.get(2);
		Object MH = companyEmpWageArray.get(3);
	  while(true){
          empAttendance = rand.nextInt(2);
          if(empAttendance == 0){
              daysPresent += 1;
              System.out.println("Day "+totalWorkingDays+": Present");
              monthlyWage += ER * empHrs;
              hoursWorked += empHrs;
          }
          else{
              System.out.println("Day "+totalWorkingDays+": Absent");
              monthlyWage += 0;
              hoursWorked += 0;
          }
          if(totalWorkingDays == ND  || !(totalWorkingHours < MH)){
              if(totalWorkingDays == ND){
                   System.out.println(ND+" days are over!");
              break;
              }
              else{
                   System.out.println(MH+" hours reached!");
              break;
              }
          }
	  totalWorkingDays++;
      	  totalWorkingHours += empHrs;
         }
      System.out.println("Company: "+CN+"\nNo of days worked out of "+ND+" days: "+daysPresent+"\nNo of hours worked out of "+MH+" hours: "+hoursWorked+"\nSalary for the month: "+monthlyWage);
      }
     /*
     *Main method
     *@param s
     */
      public static void main(String []s){
			EmployeeWageProgram emp = new EmployeeWageProgram();
	   	emp.addCompanyEmpWage("BridgeLabz",20,20,100);
			emp.calculateEmpWage();
	   	emp.addCompanyEmpWage("DMart",25,15,150);
			emp.calculateEmpWage();
	   	emp.addCompanyEmpWage("Big Basket",20,25,100);
			emp.calculateEmpWage();
			System.out.println("No of companies added: "+emp.totalCompanies());
      }
}
