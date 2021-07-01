package com.bridgelabz.employeewages;

public class Daily_Emp_Wage {

	public static void main(String[] args) {
		int isFullTime = 1;
		int wagePerHour = 20;
		int dayHour = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;  
		if (empCheck == isFullTime){
			System.out.println("Employee Is Present for Full Time");
			dayHour = 8;
		}
		else {
			System.out.println("Employee Is Absent");
		}
		int dailyEmployeeWage = wagePerHour * dayHour;
		System.out.println("Daily Employee Wage is : "+dailyEmployeeWage);
	}
}
		

	


