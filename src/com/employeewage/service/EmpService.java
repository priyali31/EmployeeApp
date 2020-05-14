package com.employeewage.service;
import com.employeewage.model.Emp;
import com.employee.service.EmpService;
public interface EmpService
{

	public boolean isPresent(Emp emp);
	public int calculatePayment(Emp emp);
	public String getEmployeeName(Emp emp);
	public int monthlyCalculatePayment(Emp emp);
	public int hundredCalculatePayment(Emp emp);

}
