/*
*Employee Wage Computation Program Use Case 5
*calculated wages for a month
*@author Moutusi Karmakar
*/
import java.util.Random;
/*Employee class*/
class Employee{
int salary;
int attendance;
static int wagePrHr;
/*
*Constructor Employee
*initialises the static variable WagePrHr
*/
Employee(){
    wagePrHr=20;
}
      /*
      *Method that gets the employee type (full time/part time) and returns the hours accordingly
      *@param type
      */
      public int getEmpType(int type){
       int dayPrHr;
       if(type==0){
          System.out.println("FULL TIME EMPLOYEE");
          dayPrHr = 8;
          return dayPrHr;
       }
       else{
          System.out.println("PART TIME EMPLOYEE");
          dayPrHr = 4;
          return dayPrHr;
       }
      }
      /*
      *Method that returns the monthly wage of an Employee based on hours worked
      *@param Hours,day
      */
      public int getMonthlyWage(int hours, int day){
	int status;
	Random rand = new Random();
	status = rand.nextInt(2);
	if(status==0){
	    System.out.println("Day "+day+": Present");								/*if employee present on that day*/
      	    salary=wagePrHr*hours;
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
      public int getDailyWage(int hours){
	int wage;
	wage=wagePrHr*hours;
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
	int dailyWage;
	int monthWage=0;
	int workHrs;
        System.out.println("Welcome to Employee Wage Computation Program");
	Employee person = new Employee();
	Random rand = new Random();
	empType = rand.nextInt(2);
	/*Storing the Hours returned in the variable workHrs*/
	workHrs = person.getEmpType(empType);
	/*Storing the daily wage in the variable dailyWage*/
	dailyWage = person.getDailyWage(workHrs);
	/*getting monthly wage (20 days salarye variable monthWage*/ 
        for (int i=1;i<=20;i++){
            monthWage += person.getMonthlyWage(workHrs,i);
	}
        System.out.println("The monthy wage (20 days) is: "+monthWage);
      }
}
