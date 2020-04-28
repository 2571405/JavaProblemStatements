/*
*Employee Wage Computation Program Use Case 5
*calculated wages for a month
*@author Moutusi Karmakar
*/
import java.util.Random;
/*Employee utility class*/
class Employee{
int salary;
int attendance;
final int WagePrHr;
/*
*Constructor Employee
*initialises the final variable WagePrHr
*/
Employee(){
    WagePrHr=20;
}
      /*
      *Method that gets the employee type (full time/part time) and returns the hours accordingly
      *@param type
      */
      public int getEmpType(int type){
       int DayPrHr;
       if(type==0){
          System.out.println("FULL TIME EMPLOYEE");
          DayPrHr = 8;
          return DayPrHr;
       }
       else{
          System.out.println("PART TIME EMPLOYEE");
          DayPrHr = 4;
          return DayPrHr;
       }
      }
      /*
      *Method that returns the monthly wage of an Employee based on hours worked
      *@param Hours,day
      */
      public int getMonthlyWage(int Hours, int day){
	int status;
	Random rand = new Random();
	status = rand.nextInt(2);
	if(status==0){
	    System.out.println("Day "+day+": Present");								/*if employee present on that day*/
      	    salary=WagePrHr*Hours;
      	    return salary;
	}
	else{
	    System.out.println("Day "+day+": Absent");
	    salary=0;																			/*if employee absent on that day*/
	    return salary;
	}
      }
      /*
      *Method that returns the daily wage of an employee according to hours worked
      *@param Hours
      */	
      public int getDailyWage(int Hours){
	int wage;
	wage=WagePrHr*Hours;
	return wage;
      }
}
/*
*Employee Wage Computation class
*Main method class
*/
class EmpWageComputation{
      public static void main(String []s){
	int empType;
	int DailyWage;
	int MonthWage=0;
	int WorkHrs;
	int get_wage;
        System.out.println("Welcome to Employee Wage Computation Program");
	Employee person = new Employee();
	Random rand = new Random();
	empType = rand.nextInt(2);
	/*Storing the Hours returned in the variable WorkHrs*/
	WorkHrs = person.getEmpType(empType);
	/*Storing the daily wage in the variable DailyWage*/
	DailyWage = person.getDailyWage(WorkHrs);
	/*getting monthly wage (20 days salarye variable MonthWage*/ 
        for (int i=1;i<=20;i++){
            MonthWage += person.getMonthlyWage(WorkHrs,i);
	}
        System.out.println("The monthy wage (20 days) is: "+MonthWage);
      }
}
