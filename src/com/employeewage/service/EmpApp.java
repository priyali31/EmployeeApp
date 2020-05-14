package com.employeewage.service;
import com.employeewage.model.Emp;
import java.util.Random;
import java.util.*;
import java.io.*;

public class EmpApp implements EmpService{

	private List<Company> companyList;

	@Override
	public boolean isPresent(Emp emp)
	{
		int random=new Random().nextInt(100)%2;
		return random==1?true:false;
	}

	public int randomWorkHours(String companyName){
		int dayHour = this.findCompany(companyName).getMaxHoursPerMonth();
		return new Random().nextInt(dayHour)%2;
	}

	public void addEmployees(String companyName,int ratePerHour,int WorkingDays,int maxHoursPerMonth)
	{
		Company cp=new Company(companyName,ratePerHour,WorkingDays,maxHoursPerMonth);
		cp.setEmpList(wrongEmployee(companyName,workingDays));
		System.out.println("Employee in company");
	}

	public ArrayList<Employee> wrongEmployee(String companyName, int WorkingDays){
		ArrayList<Employee> empList = new ArrayList<>();
		Emp ep = null;
		for(int i=0;i<10;i++)
			{
			ep = new Employee("name of employee"+i, companyName,new ArrayList<Integer>());
			for(int j=0;j<workingDays;j++)
			{
			ep.getWages().add(new Random().nextInt(10));
			}
			empList.add(ep);
		}
		return empList;
	}

	public Company findCompany(String companyName)
	{
		for (Company company : companyList) 
		{
			if(company.getCompanyName())
				return company;
		}
		return null;
	}
}
