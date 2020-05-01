
/*
*Employee Wage Computation Program
/*procedural approach
*@author Moutusi Karmakar
*/
import java.util.Random;
//Employee Wage CAlculation class
public class EmpWageCalculation{
//Constants
private static final int IS_PART_TIME = 0;
private static final int IS_FULL_TIME = 1;
	/*
	*Method for calculating monthly wage of employee based on type (part time/ full time)
	*calculates salary according to the attendance of the employee
	*@param company name, maximum woking days, wage per hour, maximum hours
	*/
      public static void calculateEmpWage(String compName, int numOfDays, int empRate, int maxHrs){
	  int totalWorkingDays = 1;
	  int totalWorkingHours = 0;
	  //variable empType tells the type of employee i.e., part time/full time
	  int empType;
	  //variable empHrs fetches the no of work hours per day according to type of employee
	  int empHrs = 0;
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
	  while(true){
          empAttendance = rand.nextInt(2);
          if(empAttendance == 0){
              daysPresent += 1;
              System.out.println("Day "+totalWorkingDays+": Present");
              monthlyWage += empRate * empHrs;
              hoursWorked += empHrs;
          }
          else{
              System.out.println("Day "+totalWorkingDays+": Absent");
              monthlyWage += 0;
              hoursWorked += 0;
          }
          if(totalWorkingDays == numOfDays || !(totalWorkingHours <= maxHrs)){
              if(totalWorkingDays == numOfDays){
                   System.out.println(numOfDays+" days are over!");
                   break;
              }
              else{
              System.out.println(maxHrs+" hours reached!");
              break;
              }
           }
           totalWorkingDays++;
           totalWorkingHours += empHrs;
          }
      System.out.println("Company: "+compName+"\nNo of days worked out of "+numOfDays+" days: "+daysPresent+"\nNo of hours worked out of "+maxHrs+" hours: "+hoursWorked+"\nSalary for the month: "+monthlyWage);
      }
      /*
      *Main method
      *@param s
      */
      public static void main(String []s){
      /*Calculating monthly wage for an employee of BridgeLabz*/
      calculateEmpWage("BridgeLabz",20,20,100);
      /*Calculating monthly wage for an employee of DMart*/
      calculateEmpWage("DMart",25,15,150);
      /*Calculating monthly wage for an employee of Big Basket*/
      calculateEmpWage("Big Basket",20,25,100);
      }
}
