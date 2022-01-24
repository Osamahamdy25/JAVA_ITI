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
public class car {
 private String maker;
 private  int  model;
 private static int num;
 
 public car()
 {
  maker="Honda"; 
   model=2022;
   num++;
 }
 public car(int m,String maker2)
 {
   model=m; 
   this.maker=maker2;
    num++;
 }
 public void set_model(int year)
 {
  if(year>2010)
 model=year;
  else 
         System.out.println("invalid model");   
 }
  public void set_maker(String m)
  {
  maker=m;
  }
  public int get_model()
  {
  return model;
  }
    public static int num_of_obj()
  {
  return num;
  }
  public String get_maker()
  {
  
  return maker;
  }
  
}
