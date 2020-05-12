

class EmployeeWage{
        static int isPresent=1;
	public static double random(){
	double status=Math.floor(Math.random()*10)%2;
	return status;
	}
	public static void EmployeeAttendance()
	{
		if( random()==isPresent)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");
	}

	public static void main (String[] args){
		System.out.println("welcome to employee wage calculation program");
		EmployeeWage empWage = new EmployeeWage();
		empWage.EmployeeAttendance();
	}
}
