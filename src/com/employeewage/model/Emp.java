package com.employeewage.model;

public class Emp
{

	private String EmployeeName;
	private int workHour,Payment;

	public Emp(int workHour)
	{
		this.workHour=workHour;
	}

	public String getEmployeeName()
	{
		return this.EmployeeName;
	}

	public void setTEmployeeName(String EmployeeName)
	{
		this.EmployeeName=EmployeeName;
	}

	public int getWorkHour()
	{
		return this.workHour;
	}

	public void setWorkHour(int workHour)
	{
		this.workHour = workHour;
	}

	public int getPayment()
	{
		return this.Payment;
	}

	public void setPayment(int payment)
	{
		this.Payment=Payment;
	}

	@Override
	public String toString()
	{
		return "Employee was " + this.EmployeeName + "Working Hours are " + this.workHour + "\n Total Pay : " + this.Payment;
	}
	
}
