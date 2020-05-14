import java.io.*;
import java.util.Random;

class EmpApp
{
	private String employeeName;
	private int perHour,workHour,dayHour,payment;
	public static Random rand=new Random();

	EmpApp(int perHour,int workHour,int dayHour)
	{
		this.setEmployeeName("Full time");
		this.perHour=perHour;
		this.workHour=workHour;
		this.dayHour=dayHour;
	}

	public String getEmployeeName()
	{
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName=employeeName;
	}

	public int PerHour()
	{
		return this.perHour;
	}

	public void setPerHour(int input)
	{
		this.perHour=input;
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
		this.payment=this.perHour*this.workHour;
		return this.payment;
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
