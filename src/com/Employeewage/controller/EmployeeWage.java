class EmployeeWage{
        
	public static double random(){
		double status=Math.floor(Math.random()*10)%2;
		return status;
	}
	public static double EmployeeAttendance(){
		int isPresent=(int)random();
		if( isPresent==1)
			System.out.println("employee is present");
		else
			System.out.println("employee is absent");
	        return isPresent;
	}
	public static void DailyWage(){
		int hrs=8;
		int wagePerHr=20;
		if(EmployeeAttendance()==1){
			System.out.println("daily wage="+hrs*wagePerHr);
		}
	}
	public static void main (String[] args){
		System.out.println("welcome to employee wage calculation program");
		EmployeeWage empWage = new EmployeeWage();
		//empWage.EmployeeAttendance();
		empWage.DailyWage();
	}
}
