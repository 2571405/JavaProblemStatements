/*
*Employee Wage Computation Program Use Case 6
*calculate wages till 20 days or 100 working hours reached
*@author Moutusi Karmakar
*/
import java.util.Random;
/*Employee class*/
class Employee{
int salary;
int attendance;
int hoursWorked;
int daysPresent;
static int wagePrHr;
/*
*Constructor Employee
*initialises the static variable WagePrHr
*/
Employee(){
   wagePrHr=20;
}
      /*
      *Method returning the working hours per day based on employee type (part time/full time)
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
      *Method returning an array that stores monthly wage and total working hours
      *@param Hours, type
      */
      public int[] getMonthlyWage(int hours, int day, int type){
       	 int status;
	 Random rand = new Random();
	 status = rand.nextInt(2);
	 int[] salaryAndHours = new int[3];
	 if(status==0){
	    System.out.println("Day "+day+": Present");
	    daysPresent += 1;
	    salary+=wagePrHr*hours;
	    if(type==0)
	       hoursWorked+=8;
	    if(type==1)
	       hoursWorked+=4;
            salaryAndHours[0] = salary;
	    salaryAndHours[1] = hoursWorked;
	    salaryAndHours[2] = daysPresent;
	    return salaryAndHours;
	 }
	 else{
	    System.out.println("Day "+day+": Absent");
	    daysPresent += 0;
	    salary+=0;
            hoursWorked+=0;
	    salaryAndHours[0] = salary;
            salaryAndHours[1] = hoursWorked;
	    salaryAndHours[2] = daysPresent;
            return salaryAndHours;
	 }
      }
      /*
      *Method that returns daily wage of employee based on Full time/Part time/Absent
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
      /*
      *Main method
      *@param s
      */
      public static void main(String []s){
         int empType;
	 int dailyWage;
	 int workHrs;
	 // Totaldays variable counts days till 20 starting from day 1
	 int totalDays=1;
	 int loop_end=0;
	 int totalWorkingHours = 0;
	 int [] salaryAndHours = new int[3];
         System.out.println("Welcome to Employee Wage Computation Program");
	 Employee person = new Employee();
	 Random rand = new Random();
	 empType = rand.nextInt(2);
	 // fetching working hours per day based on type of employee
	 workHrs = person.getEmpType(empType);
	 //calculating daily wage of employee
	 dailyWage = person.getDailyWage(workHrs);
	 System.out.println("The daily wage is: "+dailyWage);
	 //calculating monthly wage of employee according to type of employee
         while (loop_end==0){
	    /*
	    *Storing salary and total working hours returned from getMonthlyWage method in salaryAndHours array
	    */
            salaryAndHours = person.getMonthlyWage(workHrs,totalDays,empType);
	    // Loop till 20 days are over or 100 working hours completed
            if(totalDays==20 || !(totalWorkingHours < 100)){
		if(totalDays==20){
		   System.out.println("20 days over!");
		   break;
		}
		else{
		   System.out.println("100 working hours reached!");
		   break;
		}
	    }
	 totalDays+=1;
	 totalWorkingHours += workHrs;
         }
	 System.out.println("Total days worked out of 20  days: "+salaryAndHours[2]);
	 System.out.println("Total hours worked out of 100 hours: "+salaryAndHours[1]);
         System.out.println("Wage for the month is: "+ salaryAndHours[0]);
      }
}
