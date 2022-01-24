/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_ex3;

import java.applet.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Osama Mohamed Hamdy 
 */

public class Day4_ex3 extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Color c = new Color(0xF3,0xF7,0x81);
    boolean x = true;
    int y =0;
    Thread th;
    @Override
    public void init() {
        th = new Thread(this);
        th.start();
        resize(500,500);

    }

    @Override
    public void paint(Graphics g){

        if(x==true && y==0)
        {
            g.setColor(c);
        }
        else if(x==true && y==1)
        {
            g.setColor(Color.BLUE);
        }
        else if(x==true && y==2)
        {
            g.setColor(Color.CYAN);
        }
        else if(x==true && y==3)
        {
            g.setColor(Color.DARK_GRAY);
        }
        else if(x==true && y==4)
        {
            g.setColor(Color.GRAY);
        }
        else if(x==true && y==5)
        {
            g.setColor(Color.GREEN);
        }
        else if(x==true && y==6)
        {
            g.setColor(Color.LIGHT_GRAY);
        }
        else if(x==true && y==7)
        {
            g.setColor(Color.MAGENTA);
        }
        else if(x==true && y==8)
        {
            g.setColor(Color.ORANGE);
        }
        else if(x==true && y==9)
        {
            g.setColor(Color.PINK);
        }
        else if(x==true && y==10)
        {
            g.setColor(Color.RED);
        }
        else if(x==true && y==11)
        {
            g.setColor(Color.YELLOW);
        }
        else if(x==true && y==12)
        {
            g.setColor(Color.BLACK);
        }
        else{
        g.setColor(Color.WHITE); // turn off
        }
        g.fillOval(100, 20, 250, 100);
        g.fillOval(105, 160, 50, 80);
        g.fillOval(300, 160, 50, 80);
        g.fillOval(183, 140, 90, 130);
        g.setColor(Color.BLACK);        
        g.drawOval(100, 20, 250, 100);
        g.drawOval(105, 160, 50, 80);
        g.drawOval(300, 160, 50, 80);
        g.drawOval(183, 140, 90, 130);
        g.drawLine(102, 62, 50, 250);
        g.drawLine(348, 62, 400, 250);
        g.drawArc(50, 190, 350, 120, 180, 180);
        g.drawLine(217, 310, 190, 400);
        g.drawLine(233, 310, 260, 400);
        g.drawRect(100, 400, 250, 20);
        
        x=!x;
        y++;
        if(y==13)
        {
            y=0;
        }
    }
    @Override
    public void run(){
        while(true){
            repaint();  
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Day4_ex3.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}


