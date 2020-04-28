/*
*Employee WageComputation Program Use Case 1
*check attendance of employee
*@author Moutusi Karmakar
*/
import java.util.Random;
/*Employee utility class*/
class Employee{
    int salary;
    int attendance;
    /*
    *Method to check the attendance of an employee
    *@arg attendance
    */
    public void checkAttendance(int attendance){
	this.attendance = attendance;
	if(this.attendance==0)
		System.out.println("Employee Present");
	else
		System.out.println("Employee Absent");
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
     System.out.println("Welcome to Employee Wage Computation Program");
     /*Instantiating the Employee class*/
     Employee person = new Employee();
     Random rand = new Random();
     attend = rand.nextInt(2);
     /*Calling method to check attendance and printing present or absent*/
     person.checkAttendance(attend);
   }
}
