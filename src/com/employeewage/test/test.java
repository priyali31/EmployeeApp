package com.employeewage.test;
import java.util.Random;
import java.util.Scanner;
import com.employeewage.model.Emp;
import com.employeewage.service.EmpApp;

class test
{

	public static int testTest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Today's Payment is");
		System.out.println("2.Monthly Payment is");
		System.out.println("3.Employee was");
		System.out.println("4.present or absent");
		System.out.println("5.Exit");
		System.out.println("Enter Choice : ");
		int choice=sc.nextInt();
		System.out.println();
		return choice;	
	}

	public static void main(String[] args)
	{
			System.out.println("Computation");
			Random rand=new Random();
			EmployeeApp app=new EmployeeApp();
			Emp emp=new Emp(20,rand.nextInt(20),8);

			while(true)
			{
				int option=testTest();
				switch(option)
				{
					case 1:
					System.out.println("Today's Payment is  " + app.calculatePayment(emp));
					break;
					case 2:
					System.out.println("Monthly Payment is" + app.monthlyCalculatePayment(emp));
					break;
					case 3:
					System.out.println("Employee was " + emp.getEmployeeName());
					break;
					case 4:
					if(app.isPresent(emp))
					{
					System.out.println("Present");
					}
					else
					{
					System.out.println("Absent");
					}
					break;
					case 5:
					System.exit(0);
					break;

				}

			}
		    
	}

}
