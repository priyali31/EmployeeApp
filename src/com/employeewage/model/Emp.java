package com.employeewage.model;
import java.io.*;
import java.util.*;

class Emp
{
	private String EmployeeName;
	private int PerHour,workHour,DayHour,Payment;

	public Emp(int PerHour,int workHour,int DayHour)
	{
		//this.setTypeEmployee("Part-Time");
		this.PerHour=PerHour;
		this.workHour=workHour;
		this.DayHour=DayHour;
	}

	public String getEmployeeName(String EmployeeName)
	{
		return this.EmployeeName;
	}

	public void setEmployeeName(String EmployeeName)
	{
		this.EmployeeName=EmployeeName;
	}

	public int getPerHour()
	{
		return this.PerHour;
	}

	public void setPerHour(int PerHour)
	{
		this.PerHour=PerHour;
	}

	public int getWorkHour()
	{
		return this.workHour;
	}

	public void setWorkHour(int workHour)
	{
		this.workHour=workHour;
	}

	public int getDayHour()
	{
		return this.DayHour;
	}

	public void setDayHour(int DayHour)
	{
		this.DayHour=DayHour;
	}

	public int getPayment()
	{
		return this.Payment;
	}

	public void setPayment(int Payment)
	{
		this.Payment=Payment;
	}

	@Override
	public String toString(){
		return "Employee was " +this.EmployeeName + " Per hour" + this.PerHour + " WorkingHours are " + this.workHour + " Full Day hour is " + this.DayHour + "\n Total Pay : " + this.Payment;
	}
}
