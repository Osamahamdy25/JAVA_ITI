/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ex3;

/**
 *
 * @author hp
 */
public class Day2_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // first shape code 
     int rows =Integer.parseInt(args[0]);

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    } 
    
        System.out.println("   ");
    // second shape code
    int  k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    } 

    }
}
