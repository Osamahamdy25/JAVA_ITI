/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import jdk.nashorn.internal.parser.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Osama Hamdy
 */
public class Oop {

    public static void main(String[] args) throws Exception{ 
for(int i=0;i<3;i++)
{
    multithreading m1=new multithreading(i);
    m1.start();

} 
throw new RuntimeException();

}}
