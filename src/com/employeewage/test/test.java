package com.employeewage.test;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.employeewage.model.Emp;
import com.employeewage.service.EmpApp;

class test
	{

	public static int testTest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Today's Payment is");
		System.out.println("2.Monthly Payment");
		System.out.println("3.Conditional Payment is");
		System.out.println("4.Employee was");
		System.out.println("5.Present or Absent");
		System.out.println("6.Exit");
		System.out.println("Choice : ");
		int choice = sc.nextInt();
		return choice;	
	}

	public static void main(String[] args)
	{
		try{
			System.out.println("Computation Program");
			Random rand= new Random();
			EmployeeApp app= new EmployeeApp();
			Emp emp = new Emp(20,rand.nextInt(20),8);

			while(true)
				{
				int option=testTest();
				switch(option)
					{
					case 1:
					System.out.println("Today's Payment is " +app.calculatePayment(emp));
					break;
					case 2:
					System.out.println("Monthly Pay is " +app.monthlyCalculatePayment(emp));
					break;
					case 3:
					System.out.println("Conditional Pay is "+app.hundredCalculatePayment(emp));
					break;
					case 4:
					System.out.println("Employee was " +app.getEmployeeName(emp));
					break;
					case 5:
					System.out.println(app.isPresent(emp)?"Present":"Absent");
					break;
					case 6:
					System.exit(0);
					break;
					}

				}
			}catch(InputMismatchException e)
				{
				System.out.println("Wrong Number");
		                }		
		}
	}	
}
