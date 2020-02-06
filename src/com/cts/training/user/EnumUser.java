package com.cts.training.user;

import com.cts.training.enumexapmles.WeekDays;

public class EnumUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeekDays day = WeekDays.SATURDAY;
		System.out.println(day);
		int n = WeekDays.SUNDAY.getWorkingHrs();
		System.out.println(n);
	}

}
