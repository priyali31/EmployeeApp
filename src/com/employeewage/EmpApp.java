import java.io.*;
import java.util.Random;
import java.util.Scanner;

class EmpApp
{
	private String EmployeeName;
	private int PerHour,workHour,DayHour,Payment;
	public static Random rand=new Random();
	public static Scanner sc = new Scanner(System.in);

	EmpApp(int PerHour,int workHour,int DayHour)
	{
		this.setEmployeeName("Full time");
		this.PerHour=PerHour;
		this.workHour=workHour;
		this.DayHour=DayHour;
		this.calculatePayment();
	}

	public String getEmployeeName()
	{
		return this.EmployeeName;
	}

	public void EmployeeName(String EmployeeName)
	{
		this.EmployeeName=EmployeeName;
	}

	public int getPerHour()
	{
		return this.PerHour;
	}

	public void PerHour(int input)
	{
		this.PerHour=input;
	}

	public int calculatePayment()
	{
		if(this.workHour<this.DayHour)
		{
			this.setEmployeeName("Part time");
		}
		this.Payment=this.PerHour*this.workHour;
		return this.Payment;
	}

	public boolean isPresent()
	{
		if(this.workHour<1)
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args)
	{

 		System.out.println("Computation");
		EmpApp appObj=new EmpApp(20,rand.nextInt(20),8);

			while(true)
			{
				System.out.println("1.Payment");
				System.out.println("2.Employee");
				System.out.println("3.present or absent");
				System.out.println("4.Exit");
				System.out.println("Choice is");
				int choice = sc.nextInt();
				System.out.println();

				switch(choice)
					{
						case 1:
						  System.out.println("Payment is " +appObj.calculatePayment());
						  break;
						case 2:
						  System.out.println("Employee was "+appObj.getEmployeeName());
						  break;
						case 3:
						  if(appObj.isPresent())
						  {
						   System.out.println("Present");
						  }
						  else
						  {
						   System.out.println("Absent");
						  }
						   break;
						case 4:
						  System.exit(0);
						  break;
					}

         		}

	}

}

