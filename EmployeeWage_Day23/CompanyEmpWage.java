public class CompanyEmpWage{

public static String compName;
public static int numOfDays;
public static int empRate;
public static int maxHrs;

public CompanyEmpWage(){

}

public CompanyEmpWage(String compName, int numOfDays, int empRate, int maxHrs){
 this.compName = compName;
 this.numOfDays = numOfDays;
 this.empRate = empRate;
 this.maxHrs = maxHrs;
}

public static String getcompName(){
	return compName;
}

public static int getnumOfDays(){
	return numOfDays;
}

public static int getempRate(){
	return empRate;
}

public static int getmaxHrs(){
	return maxHrs;
}


}
