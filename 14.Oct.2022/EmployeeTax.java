package com.cognizant.tax;
/*
 Scenario: Developers need to develop a tax calculator for calculating tax using arithmetic, relational and logical operators.
 Problem Statement 5: Execute the methods
 Develop another class “EmployeeTax”  inside the package “ com.cognizant.tax” add a main method which sets the values and invoke the following methods in the TaxCalculator  object.
Test Case 1:  Specify the following values and run the main method
1.	Set  the value of citizenship as true, basicSalary as 25000.
2.	Invoke the methods calculateTax(), deductTax(), validateTax().
Output:  The following messages should be displayed in the console
The Tax of the employee  for  the   25000 is 7500
The nett salary of the employee 17500
The salary and citizenship eligibility:  false
Test Case 2:  Specify the following values and run the main method
1.	Set  the value of citizenship as true, basicSalary as 125000.
2.	Invoke the methods calculateTax(), deductTax(), validateTax().
Output:  The following messages should be displayed in the console
The Tax of the employee  for  the   125000 is 37500
The nett salary of the employee 87500
The salary and citizenship eligibility:  true
 */
public class EmployeeTax {
		// create a class for invoking method.
		public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator();
		//invoking methods are
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();
		}}