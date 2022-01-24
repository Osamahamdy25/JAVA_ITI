/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class NewApplet extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
 
        int x=0;
        @Override
    public void init()
    {
 
       Button b=new Button("x++");
    Mylistener li=new Mylistener(); 
    b.addActionListener(li);
  
      add(b);
    }
  
    class Mylistener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
       x++;
        repaint();
        
        }
        
        
    
    }
   
   
    @Override
 public void paint(Graphics g)
 {
 g.drawString("x = "+x,100,100);
 }
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
