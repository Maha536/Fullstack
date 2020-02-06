package com.cts.training.enumexapmles;

public enum WeekDays {
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	public int workingHrs;
	
	private WeekDays(){
		this.workingHrs=8;
	}

	public int getWorkingHrs() {
		// TODO Auto-generated method stub
		//which day called this method
		if(this == SATURDAY || this == SUNDAY)
			return this.workingHrs-8;
		return workingHrs;
		
		
	}
}
