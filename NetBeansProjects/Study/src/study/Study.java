/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Osama Hamdy 
 */
/***************Start of the Class****************************************/
 
public class Study {
      
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
       int [] [] arr=new int [5][3]; // remember that the array is zero based 
       for(int row=0;row<arr.length;row++)
       {
       for(int col=0;col<arr[0].length;col++)
       {
           System.out.println("enter data for row number"+row+"and coloum number"+col);
          arr[row][col]=input.nextInt();
       }
       }
         for(int row=0;row<arr.length;row++)
       {
       for(int col=0;col<arr[0].length;col++)
       {
           System.out.println(arr[row][col]);
       }
       }
            for(int row=0;row<arr.length;row++)
       {
      
       for(int col=0;col<arr[0].length;col++)
       { 
           sum +=arr[row][col];
       }
       }
            System.out.println("sum = "+ sum );
    }
    
 
    
    
/***************************************end of class************************************/
}
