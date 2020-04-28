/*
*Employee Wage Computation Program Use Case 3
*add part time employee
*@author Moutusi Karmakar
*/
import java.util.Random;
/*Employee Utility class*/
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
     *Method that returns daily wage of employee based on Full time/Part time/Absent
     *@param attendance
     */
     public int getDailyWage(int attendance){
	 int DayPrHr;
	 this.attendance = attendance;
	 if(this.attendance==0){
	    System.out.println("Full time employee");
	    DayPrHr=8;
	 }
	 else if(this.attendance==1){
             System.out.println("Part time employee");
	     DayPrHr=4;
	 }
	 else{
	     System.out.println("Employee absent");
	     DayPrHr=0;
	  }
	  salary=WagePrHr*DayPrHr;
	  return salary;
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
	 int attend;
         int DailyWage;
         System.out.println("Welcome to Employee Wage Computation Program");
         Employee person = new Employee();
         Random rand = new Random();
         attend = rand.nextInt(3);
         /*
         *storing wage returned from getDailyWage method in DailyWage variable
         */
         DailyWage = person.getDailyWage(attend);
         System.out.println("The Daily wage is: "+DailyWage);
      }
}
