/*
*Employee Wage Computation Program Use Case 4
*solve using switch case
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
Employee() {
   WagePrHr=20;
}
      /*
      *Method that returns daily wage of employee using switch case	
      *@param attendance	
      */
      public int getDailyWage(int attendance){
	 int DayPrHr=2;
	 this.attendance = attendance;
	 switch(attendance){
	  case 0:
	    System.out.println("Full time employee");
            DayPrHr = 8;
	  break;
	  case 1:
	     System.out.println("Part time employee");
	     DayPrHr = 4;
	  break;
	  case 2:
	     System.out.println("Employee absent");
	     DayPrHr = 0;
	  break;
	  default:
	     System.out.println(" ");
	  break;
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
	 /*Storing the wage returned from the getDailyWage method in DailyWage variable*/
	 DailyWage = person.getDailyWage(attend);
	 System.out.println("The Daily wage is: "+DailyWage);
      }
}
