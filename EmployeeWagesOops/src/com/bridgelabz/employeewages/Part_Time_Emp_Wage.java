package com.bridgelabz.employeewages;

public class Part_Time_Emp_Wage {

	public static void main(String[] args) {
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHour = 20;
		int dayHour = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;  
		if (empCheck == isFullTime){
			System.out.println("Employee is Present for Full Time");
			dayHour = 8;
		}
		else if (empCheck == isPartTime){
			System.out.println("Employee is Present for Part Time");
			dayHour = 4;
		}
		else {
			System.out.println("Employee is Absent");
		}
		int dailyEmployeeWage = wagePerHour * dayHour;
		System.out.println("Daily Employee Wage is : "+dailyEmployeeWage);
		

	}

}
