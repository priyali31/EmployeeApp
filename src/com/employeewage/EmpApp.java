import java.io.*;
import java.util.Random;

class EmpApp
{
	private String EmployeeName;
	private int PerHour,workHour,DayHour,Payment;
	public static Random rand=new Random();

	EmpApp(int PerHour,int workHour,int DayHour)
	{
		this.setEmployeeName("Full time");
		this.PerHour=PerHour;
		this.workHour=workHour;
		this.DayHour=DayHour;
	}

	public String getEmployeeName()
	{
		return this.EmployeeName;
	}

	public void setEmployeeName(String EmployeeName)
	{
		this.EmployeeName=EmployeeName;
	}

	public int PerHour()
	{
		return this.PerHour;
	}

	public void setPerHour(int input)
	{
		this.PerHour=input;
	}

	public static boolean isPresent(){
		int random=rand.nextInt(50)%2;
		return random==1?true:false; 
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

	public static void main(String[] args)
		{
		EmpApp appObj = new EmpApp(20,rand.nextInt(20),8);
		System.out.println("Payment of Employee is "+appObj.calculatePayment());
		System.out.println("Employee was  "+appObj.getEmployeeName());
		System.out.println("Computation");
			if(isPresent())
			{
				System.out.println("Present");
			}
			else
			{
				System.out.println("Absent");
			}
		}
}
