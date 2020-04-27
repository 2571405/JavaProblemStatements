import java.util.Random;
class Employee{
	int salary;
	int attendance;

	public void check_attendance(int attendance)
	{
		this.attendance = attendance;
		if(this.attendance==0){
			System.out.println("Employee Present");
		}
		else{
			System.out.println("Employee Absent");
		}
	}

}
class EmpWageComputation{
   public static void main(String []s){
		int attend;
      System.out.println("Welcome to Employee Wage Computation Program");
		Employee person = new Employee();
		Random rand = new Random();
		attend = rand.nextInt(2);
		person.check_attendance(attend);
   }
}
