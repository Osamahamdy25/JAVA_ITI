/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_ex1;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  Osama Mohamed Hamdy 
 */
public class Day4_ex1 extends Applet implements Runnable {

    
    Thread th;
    @Override
    public void init(){
        th = new Thread(this);
        th.start();
}
    @Override
    public void paint(Graphics g)
    {
        //resize(400,200);
        Date d = new Date();
        Font f=new Font("Arial",1,20);
        g.setFont(f);
        g.drawString(d.toString(),(getWidth()/2)-140,getHeight()/2);
    }
    @Override
    public void run(){
        while(true){
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Day4_ex1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
 
