package com.employeewage.service;
import java.util.InputMismatchException;
import com.employeewage.model.Emp;
import java.util.Random;

public class EmpApp
{

	public boolean isPresent(Emp emp)
	{
		if(emp.getWorkHour() < 1)
		{
			return false;
		}
		return true;
	}

	public int calculatePayment(Emp emp)
	{
		emp.setPayment(emp.getPerHour()*emp.getWorkHour());
		return emp.getPay();
	}

	public String getEmployeeName(Emp emp)
	{
		if((emp.getWorkHour()/20)<emp.getDayHour())
		{
			emp.setEmployeeName("Part time");
		}
		else
		{
			emp.setEmployeeName("Full time");
		}
		return emp.getEmployeeName();		
	}

	public int monthlyCalculatePayment(Emp emp)
		{
		Random rand=new Random();
		for(int i=0;i<20;i++)
		{
			emp.setWorkHour(emp.getWorkHour()+rand.nextInt(20));
		}
		emp.setPayment(emp.getPerHour()*emp.getWorkHour());
		return emp.getPayment();
	}

	public int hundredCalculatePayment(Emp emp)
		{
		Random rand=new Random();
		while(emp.getWorkHour()<=100)
		{
			emp.setWorkHour(emp.getWorkHour()+rand.nextInt(20));
		}
		emp.setPay(emp.getPerHour() * emp.getWorkHour());
		return emp.getPayment();
	}

}
