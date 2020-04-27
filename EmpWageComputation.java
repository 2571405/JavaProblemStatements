import java.util.Random;
class Employee{
	int salary;
	int attendance;
	final int WagePrHr;

	Employee(){
		WagePrHr=20;
	}

	public int get_emp_type(int type){
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

	public int get_monthly_salary(int Hours, int day)
   {
		int status;
		Random rand = new Random();
		status = rand.nextInt(2);
		if(status==0){
			System.out.println("Day "+day+": Present");								/*if employee present on that day*/
      	salary=WagePrHr*Hours;
      	return salary;
		}
		else{
			System.out.println("Day "+day+": Absent");
			salary=0;																			/*if employee absent on that day*/
			return salary;
		}
   }

	public int get_daily_salary(int Hours)
	{
		int wage;
		wage=WagePrHr*Hours;
		return wage;
	}

}


class EmpWageComputation{
   public static void main(String []s){
		int empType;
		int DailyWage;
		int MonthWage=0;
		int WorkHrs;
		int get_wage;
      System.out.println("Welcome to Employee Wage Computation Program");
		Employee person = new Employee();
		Random rand = new Random();
		empType = rand.nextInt(2);
		WorkHrs = person.get_emp_type(empType);
		DailyWage = person.get_daily_salary(WorkHrs);
      for (int i=1;i<=20;i++){
      MonthWage += person.get_monthly_salary(WorkHrs,i);
		//MonthWage = MonthWage+get_wage;
      }
      System.out.println("The monthly wage (20 dasys) is: "+ MonthWage);
   }
}
