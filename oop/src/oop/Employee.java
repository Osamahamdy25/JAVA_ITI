/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author hp
 */
public  class Employee {
    
    int emp_id; 
    String e_name; 
    String depart; 
    double salary ; 
    double bouns; 
    boolean resident;
    /*********default constructor*********************/
    public Employee()
    {
    emp_id=100; 
    e_name="No Name";
    salary=3000; 
    bouns=500; 
    depart="Not Assigned yet";
    resident=true;
    
    }
    public Employee(int id,String name)
    {
    
    emp_id=id;
    e_name=name;
    }
  public Employee(int id,String name,boolean r)
    {
    
    //emp_id=id;
    //e_name=name;
    this(id,name);
    resident=r;
    }
  public Employee(int id,String name,boolean r,double s,double b,String d)
  {
  
  this(id,name,r);
  salary=s; 
  bouns=b; 
  depart=d;
  
  }
    public  void print_emp_data()
    {
    
         System.out.println("ID ="+emp_id);
         System.out.println("NAME ->"+e_name);
         System.out.println("Depart ->"+depart);
         System.out.println("salary = "+salary);
         System.out.println("bouns ="+bouns);
         System.out.println("resident ->"+resident);
    
    
    }
    
    
    public void set_salary(double s)
    {
     salary=s;  
     
    }
    public void set_salary(double s,double b)
    {
     this.set_salary(s);
     bouns=b;
     
    }
    public double getsalary()
    {
     return salary;  
     
    }
    
}
