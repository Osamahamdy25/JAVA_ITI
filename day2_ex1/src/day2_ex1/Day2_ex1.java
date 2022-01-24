/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ex1;

/**
 *
 * @author hp
 */
public class Day2_ex1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x= Integer.parseInt(args[0]);
        int y= Integer.parseInt(args[2]);
        int res=0;
        switch(args[1])
        {
            case "+":
                res=x+y; 
                break;
            case "*":
                 res=x*y; 
                break;
            case "/": 
                 res=x/y; 
                break;
            case "-":
                 res=x-y; 
                break;
            default : 
                System.err.println("error operation");
        }
        System.err.println("res = "+res);
    }
    
}
