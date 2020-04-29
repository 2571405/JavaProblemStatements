/*
*Employee Wage Computation Program Use Case 4
*solve using switch case
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
Employee() {
   wagePrHr=20;
}
      /*
      *Method that returns daily wage of employee using switch case	
      *@param attendance	
      */
      public int getDailyWage(int attendance){
	 int dayPrHr=2;
	 this.attendance = attendance;
	 switch(attendance){
	  case 0:
	    System.out.println("Full time employee");
            dayPrHr = 8;
	  break;
	  case 1:
	     System.out.println("Part time employee");
	     dayPrHr = 4;
	  break;
	  /*case 2:
	     System.out.println("Employee absent");
	     dayPrHr = 0;
	  break;*/
	  default:
	     System.out.println(" ");
	  break;
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
	 /*Storing the wage returned from the getDailyWage method in DailyWage variable*/
	 dailyWage = person.getDailyWage(attend);
	 System.out.println("The Daily wage is: "+dailyWage);
      }
}
