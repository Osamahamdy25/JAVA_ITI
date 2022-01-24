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
public class salaried_emp extends Employee{
    double bouns; 
    double deduct; 
  
      public salaried_emp(int id,String name,boolean r,double s,double b,String d,double bo,double de)
    {
    super(id,name,r,s,b,d);
    bouns=bo;
    deduct=de;
    }
  
    @Override
    public double getsalary()
    {
     return salary+bouns-deduct;  
     
    }
}
