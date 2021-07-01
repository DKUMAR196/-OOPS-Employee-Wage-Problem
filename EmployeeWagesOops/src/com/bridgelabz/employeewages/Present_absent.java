package com.bridgelabz.employeewages;

public class Present_absent {
	public static void main(String[] args) {
		int isPresent = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;  
		if (empCheck == isPresent){
			System.out.println("Employee Is Present");
		}
		else {
			System.out.println("Employee Is Absent");
		}
	}

}
