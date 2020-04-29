/*
*Employee Wage Computation Program Use Case 3
*add part time employee
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
*initialises the variable WagePrHr
*/
Employee(){
   wagePrHr=20;
}
     /*
     *Method that returns daily wage of employee based on Full time/Part time/Absent
     *@param attendance
     */
     public int getDailyWage(int attendance){
	 int dayPrHr;
	 this.attendance = attendance;
	 if(this.attendance==0){
	    System.out.println("Full time employee");
	    dayPrHr=8;
	 }
	 else{
             System.out.println("Part time employee");
	     dayPrHr=4;
	 }
	  salary=wagePrHr*dayPrHr;
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
         int dailyWage;
         System.out.println("Welcome to Employee Wage Computation Program");
         Employee person = new Employee();
         Random rand = new Random();
         attend = rand.nextInt(2);
         /*
         *storing wage returned from getDailyWage method in dailyWage variable
         */
         dailyWage = person.getDailyWage(attend);
         System.out.println("The Daily wage is: "+dailyWage);
      }
}
