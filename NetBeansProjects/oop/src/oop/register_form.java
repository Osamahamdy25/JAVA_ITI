/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Osama Hamdy 
 */
enum Gender {male ,female};
enum course{database,programming,math,ERP};
enum semester{summer,winter,fall,spring};
public class register_form {
  String stdname;
  Gender stdgender;
  course stdcourse;
  semester sem;  
    
  public register_form()
  {
  
  stdname="Osama";
  stdgender=Gender.male;
  stdcourse=course.programming;
  sem=semester.spring;
  
  }
}
