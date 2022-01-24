/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class multithreading implements Runnable{
    private int thread_num;
    public multithreading(int num)
    {
     thread_num=num;
    
    }
    
    @Override
    public  void  run()
    { 
        for(int i=0;i<=5;i++)
        {
        
            System.out.println(i+"thread number "+thread_num);
            if(thread_num==3)
            {
            throw  new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(multithreading.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    
    
    
    }
}
