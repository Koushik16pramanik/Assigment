package com.cognizant.tax;
/*
 Scenario: Developers need to develop a tax calculator for calculating tax using arithmetic, relational and logical operators.
Problem Statement 1: Declaring instance variables.
Develop a class “TaxCalculator” inside a package “com.cognizant.tax”. The class should have an instance float variable named “basicSalary” and a boolean variable  named “citizenship”.
Problem Statement 2: Usage of Arithmetic operators.
In the TaxCalculator class  create a method named  calculateTax()  that  should calculate and print the tax, the tax should  be calculated as follows
tax = 30*basic salary/100
NOTE: The value stored in the instance variable” basicSalary” should be used in the above calculation.
The calculated tax needs to be stored in another instance float variable “tax”.
This method will display the following message in the console.
“The Tax of the employee  for  the   <basic Salary> is <tax>”
Problem Statement 3: How to type cast?
In the TaxCalculator class  create a method named  deductTax() method this should reduce the tax calculated in problem statement 1 from  the basic salary and store it in a  instance int variable named  “nettSalary”.
NOTE:  Ensure to use casting for converting float to int.
This method will also display the following message in the console.
“The nett salary of the employee” <nettSalary>

Problem Statement 4: Usage of relational operator
In the TaxCalculator class  create a method named  validateSalary() method should display a message as below if the basicSalary  is greater than 1 lakh  and  citizenship is true.
“The salary and citizenship eligibility:  ” <response>
<response> - The value would be printed as true if basic salary > 1 lakh and citizenship is true.
The value would be printed as false for other conditions.
 */
public class TaxCalculator 	{
		// create a class
	 float basicSalary;		//Given data
	 boolean citizenship;	//Given data
	 void calculateTax()   	{
		 // Tax calculater
	 int tax=(int) (30*basicSalary/100);
	 	//Given data calculation of tax, typecasting to convert float to int.
	 System.out.println("The Tax of the employee for  "+ basicSalary+" is "+ tax+" rupees");	
	 }
 	 void deductTax() 		{ 
 		 // method to check nettsalary
	 float tax1=30*basicSalary/100;
	 	//typecasting to convert float to int
	 int nettSalary=(int) (basicSalary-tax1);
	 System.out.println("The nett salary of the employee : "+nettSalary +" rupees");
 	 }
  	 void validateSalary()	{  
  		 // citizenship eligibility
	 if(basicSalary>100000||citizenship==true) {
	 System.out.println("The salary citizenship eligibility : true");
	 }
	 else
	 System.out.println("The salary citizenship eligibility :false");
  	 }}