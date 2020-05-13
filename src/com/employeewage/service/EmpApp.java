package com.employeewage.service;
import java.util.InputMismatchException;
import com.employeewage.model.Emp;
import java.util.Random;
import java.io.*;

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
		if(emp.getWorkHour()<emp.DayHour())
		{
			emp.setEmployeeName("Part time");
		}
		else{
			emp.EmployeeName("Full time");
		}
		emp.setPayment(emp.getPerHour()*emp.getWorkHour());
		return emp.getPayment();
	}

	public int monthlyCalculatePayment(Emp emp)
	{
		Random rand=new Random();
		for(int i=0;i<20;i++)
		{
			emp.setWorkHour(rand.nextInt(20));
			emp.setPayment(emp.getPayment()+(emp.getPerHour()*emp.getWorkHour()));
		}
		return emp.getPaymemt();
	}

}
