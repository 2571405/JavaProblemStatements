/*
*Employee Wage Computation Program Use Case 2
*to calculate daily wage of employee
*@author Moutusi Karmakar
*/
import java.util.Random;
/*
*Employee utility class
*@author Moutusi Karmakar
*/
class Employee{
int salary;
int attendance;
final int WagePrHr;
/*
*Constructor Employee
*Initializing final variable WagePrHr
*/
 Employee(){
    WagePrHr=20;
 }
    /*
    *Method that returns the daily wage of an Employee based on his attendance
    *@param attendance
    */
    public int getDailyWage(int attendance)
    {
	int DayPrHr;
	this.attendance = attendance;
	if(this.attendance==0){
		System.out.println("Employee Present");
		DayPrHr=8;
	}
	else{
		System.out.println("Employee Absent");
		DayPrHr=0;
	}
	salary=WagePrHr*DayPrHr;
	return salary;
     }
}
/*
*Employee Wage Computation class
*Main Method class
*@author Moutusi Karmakar
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
     	attend = rand.nextInt(2);
     	/*
     	*Storing returned wage from getDailyWage method in DailyWage variable
     	*/
     	DailyWage = person.getDailyWage(attend);
     	System.out.println("The Daily wage is: "+DailyWage);
   }
}
