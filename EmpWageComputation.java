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
static int wagePrHr;
/*
*Constructor Employee
*Initializing static variable WagePrHr
*/
 Employee(){
    wagePrHr=20;
 }
    /*
    *Method that returns the daily wage of an Employee based on his attendance
    *@param attendance
    */
    public int getDailyWage(int attendance)
    {
	int dayPrHr;
	this.attendance = attendance;
	if(this.attendance==0){
		System.out.println("Employee Present");
		dayPrHr=8;
	}
	else{
		System.out.println("Employee Absent");
		dayPrHr=0;
	}
	salary=wagePrHr*dayPrHr;
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
     	int dailyWage;
     	System.out.println("Welcome to Employee Wage Computation Program");
     	Employee person = new Employee();
     	Random rand = new Random();
     	attend = rand.nextInt(2);
     	/*
     	*Storing returned wage from getDailyWage method in DailyWage variable
     	*/
     	dailyWage = person.getDailyWage(attend);
     	System.out.println("The Daily wage is: "+dailyWage);
   }
}
