/*
*Employee Wage Computation Program
*calculate monthly wages till 20 days or 100 working hours reached
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
      *Method returning the working hours per day based on employee type (part time/full time)
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
      *Method returning an array that stores monthly wage and total working hours
      *@param Hours, type
      */
      public int[] getMonthlyWage(int Hours, int day, int type){
       	 int status;
	 int hrs_worked=0;
	 Random rand = new Random();
	 status = rand.nextInt(2);
	 int[] salary_and_hours = new int[2];
	 if(status==0){
	    System.out.println("Day "+day+": Present");
	    salary+=WagePrHr*Hours;
	    if(type==0)
	       hrs_worked+=8;
	    if(type==1)
	       hrs_worked+=4;
            salary_and_hours[0] = salary;
	    salary_and_hours[1] = hrs_worked;
	    return salary_and_hours;
	 }
	 else{
	    System.out.println("Day "+day+": Absent");
	    salary+=0;
            hrs_worked+=0;
	    salary_and_hours[0] = salary;
            salary_and_hours[1] = hrs_worked;
            return salary_and_hours;
	 }
      }
      /*
      *Method that returns daily wage of employee based on Full time/Part time/Absent
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
      /*
      *Main method
      *@param s
      */
      public static void main(String []s){
         int empType;
	 int DailyWage;
	 int WorkHrs;
	 // Totaldays variable counts days till 20 starting from day 1
	 int TotalDays=1;
	 int loop_end=0;
	 int [] salary_and_hours = new int[2];
         System.out.println("Welcome to Employee Wage Computation Program");
	 Employee person = new Employee();
	 Random rand = new Random();
	 empType = rand.nextInt(2);
	 // fetching working hours per day based on type of employee
	 WorkHrs = person.getEmpType(empType);
	 //calculating daily wage of employee
	 DailyWage = person.getDailyWage(WorkHrs);
	 System.out.println("The daily wage is: "+DailyWage);
	 //calculating monthly wage of employee according to type of employee
         while (loop_end==0){
	    /*
	    *Storing salary and total working hours returned from getMonthlyWage method in salary_and_hours array
	    */
            salary_and_hours = person.getMonthlyWage(WorkHrs,TotalDays,empType);
	    // Loop till 20 days are over or 100 working hours completed
            if(TotalDays==20 || salary_and_hours[1]==100){
		if(TotalDays==20){
		   System.out.println("20 days over!");
		   break;
		}
		else{
		   System.out.println("100 working hours completed!");
		   break;
		}
	    }
	 TotalDays+=1;
         }
         System.out.println("The monthly wage is: "+ salary_and_hours[0]);
      }
}
