/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_ex2;

import java.awt.*;
import java.applet.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Osama Mohamed Hamdy
 */

//marquee that moves from Right To Left using applet



public class Day4_ex2 extends Applet implements Runnable
{
    int x=0;
    Thread th;
    @Override
    public void init(){
        th = new Thread(this);
        th.start();
        resize(400,200);

    }
    @Override
    public void paint(Graphics g){
        Font f=new Font("Arial",1,20);
        g.setFont(f);
        g.drawString("OSAMA", 0+x, 30);
        x+=5;
        if(x>this.getWidth()){
            x=0;
        }
    }
    @Override
       public void run(){
        while(true){
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Day4_ex2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }





}
