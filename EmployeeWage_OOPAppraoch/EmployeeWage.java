/*
*Employee Wage Computation Program
*object oriented approach
*@author Moutusi Karmakar
*/
import java.util.Random;
//Employee Wage class
public class EmployeeWage{
//Constants
private static final int IS_PART_TIME = 0;
private static final int IS_FULL_TIME = 1;
//class variables specific to one company
private static String compName;
private static int numOfDays;
private static int empRate;
private static int maxHrs;

public EmployeeWage(String compName, int numOfDays, int empRate, int maxHrs){
    this.compName = compName;
    this.numOfDays = numOfDays;
    this.empRate = empRate;
    this.maxHrs = maxHrs;
}
      /*
      *Main method
      *@param s
      */
      public static void main(String []s){
	  final EmployeeWage bridgelabz = new EmployeeWage("DMart",20,20,100);
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
              monthlyWage += bridgelabz.empRate * empHrs;
              hoursWorked += empHrs;
          }
          else{
              System.out.println("Day "+totalWorkingDays+": Absent");
              monthlyWage += 0;
	      hoursWorked += 0;
          }
          if(totalWorkingDays == bridgelabz.numOfDays || !(totalWorkingHours <= bridgelabz.maxHrs)){
		if(totalWorkingDays == bridgelabz.numOfDays){
		     System.out.println(bridgelabz.numOfDays+" days are over!");
		     break;
		}
		else{
		     System.out.println(bridgelabz.maxHrs+" hours reached!");
            	      break;
	        }
          }
	 totalWorkingHours += empHrs;
         totalWorkingDays++;
         }
      System.out.println("Company: "+bridgelabz.compName+"\nNo of days worked out of "+bridgelabz.numOfDays+" days: "+daysPresent+" days\nNo of hours worked out of "+bridgelabz.maxHrs+" hours: "+hoursWorked+" hours\nSalary for the month: "+monthlyWage);
      }
}
