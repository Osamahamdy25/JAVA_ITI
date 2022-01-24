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
public class rect {
    double length; 
    public double  width;
    public rect()
    {
    
    length=10; 
    width=15; 
    System.out.println("A new room is created");
    
    }
    public rect(double l,double m)
    {

    
    this.length=l;
    this.width=m;
    
    }
    public void  set_lengh(double l)
    {
       this.length=l;
    
    }
     public void  set_width(double w)
    {
       this.width=w;
    
    }
     
     public double get_length()
     {
     
     return length;
     }
     public double get_wigth()
     {
     
     return width;
     }
     public double get_area()
     {
     
     return width*length;
     }
     
     public void modify_object(rect r)
     {
     
     r.length=55; 
     r.width=40;
     
     }
     public rect add(rect r2)
     {
     
     rect r=new rect();
     r.length=this.length+r2.length;
     r.width=this.width+r2.width;
        return r;
     
     } 
     
     public rect(rect r)
     {
     length=r.length; 
     width=r.width;
     }
     
    
}
