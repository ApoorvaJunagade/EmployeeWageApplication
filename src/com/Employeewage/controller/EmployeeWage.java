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
	public static int isPartTime(){
		int hrs;
		int isPartTime=(int)random();
		if( isPartTime==1){
			 hrs=4;
		}
		else
			 hrs=8;
		return hrs;
	}

	public static void DailyWage(){
		int Hr=isPartTime();
		int wagePerHr=20;
		if(EmployeeAttendance()==1){
			if(Hr==4)
				System.out.println("daily wage for part time="+Hr*wagePerHr);
			else
				System.out.println("daily wage for full time="+Hr*wagePerHr);
		}
		
	}
	public static void main (String[] args){
		System.out.println("welcome to employee wage calculation program");
		EmployeeWage empWage = new EmployeeWage();
		//empWage.EmployeeAttendance();
		empWage.DailyWage();
	}
}
