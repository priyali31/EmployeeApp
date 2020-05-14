package com.employeewage.model;
import com.employeewage.model.Emp;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Company 
{
    private final String companyName;
    private final int ratePerHour;
    private final int WorkingDays;
    private final int maxHoursPerMonth;
    private int totalWage;
    List<Emp> empList;

    public Company(String companyName,int ratePerHour,int WorkingDays,int maxHoursPerMonth)
    {
        this.companyName=companyName;
        this.ratePerHour=ratePerHour;
        this.WorkingDays=WorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;
        totalWage=0;
        empList = new ArrayList<Emp>();
    }

    public String getCompanyName()
    {
        return this.companyName;
    }

    public int getRatePerHour()
    {
        return this.ratePerHour;
    }

    public int getWorkingDays()
    {
        return this.WorkingDays;
    }

    public int getMaxHoursPerMonth()
    {
        return this.maxHoursPerMonth;
    }

    public int getTotalWage()
    {
        return this.totalWage;
    }

    public void setTotalWage(int totalWage)
    {
        this.totalWage=totalWage;
    }

    public List<Employee> getEmpList()
    {
        return this.empList;
    }

    public void setEmpList(ArrayList<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString()
    {
        return "Company name is  "+ this.companyName +"Total Employee Wage is " + this.totalWage;
    }
}
