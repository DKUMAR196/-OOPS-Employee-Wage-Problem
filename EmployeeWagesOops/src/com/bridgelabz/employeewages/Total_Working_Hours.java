package com.bridgelabz.employeewages;

public class Total_Working_Hours {

	public static void main(String[] args) {
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int MONTHLY_WORKING_DAYS = 20;
		final int MONTHLY_WORKING_HOURS = 100;
		
		int dayHour = 0;
		int dailyEmployeeWage = 0;
		int monthlyWage = 0;
		int workingHours = 0;
		for (int i = 0; i < MONTHLY_WORKING_DAYS && workingHours < MONTHLY_WORKING_HOURS; i++) {
			double empCheck = Math.floor(Math.random() * 10) % 3;  
			switch ((int) empCheck) {
				case IS_FULL_TIME:
					dayHour = 8;
					break;
					
				case IS_PART_TIME:
					dayHour = 4;
					break;
					
				default:
					dayHour = 0;
			}
			dailyEmployeeWage = WAGE_PER_HOUR * dayHour;
			monthlyWage += dailyEmployeeWage;
			workingHours += dayHour; 
		}
		System.out.println("Monthly Employee Wage is : "+monthlyWage);

	}

}
