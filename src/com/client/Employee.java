package com.client;

public class Employee {
    private String name ;
    private String familyName;
    private int cin ;
    private int telephoneNumber;

    public Employee(String EmployeeName ,String EmployeeFamilyName, int EmployeeCin, int EmplyeeTelephoneNUmber)
    {
        this.name=EmployeeName;
        this.familyName=EmployeeFamilyName;
        this.cin=EmployeeCin;
        this.telephoneNumber=EmplyeeTelephoneNUmber;
    }

    public String getEmployeeName()
    {
        return this.name;
    }

    public String getEmplyeeFamilyName()
    {
        return this.familyName;
    }

    public int getEmployeeCIN()
    {
        return this.cin;
    }

    public int getEmplyeeTelephoneNumber()
    {
        return this.telephoneNumber;
    }

    public String getDescription()
    {
        return "The employee named :"+this.getEmployeeName()+" "+this.getEmplyeeFamilyName()+" with identity card number :"+this.getEmployeeCIN()+"has a telephone which number is "+this.getEmplyeeTelephoneNumber();

    }

}
