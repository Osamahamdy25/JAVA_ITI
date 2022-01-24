/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author WINDOWS
 */
public class NewApplet extends Applet implements KeyListener  {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int x,y;
    
    
   
    @Override
    public void init() {
        
        
        
        x=50;y=50;
        
        this.addKeyListener(this);
        //setSize(500,500);
    }
    
    
    @Override
    public void paint(Graphics g)
    {
        if(getSize().width-20<x)
            x=10;
        if(getSize().height-10<y)
            y=10;
        if(x<10)
            x=getSize().width-20;
        if(y<10)
            y=getSize().height-10;
        g.drawString("Java", x, y);
    }
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void keyTyped(KeyEvent ke) {
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        System.out.println("pressed");
        //int key = ke.getKeyCode();

            if (ke.getKeyCode() == KeyEvent.VK_LEFT)
                x -=10;
                

            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) 
                x +=10;
    

            if (ke.getKeyCode() == KeyEvent.VK_UP) 
                y -=10;
    

            if (ke.getKeyCode() == KeyEvent.VK_DOWN) 
                y +=10;
   
            repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       // System.out.println("ket resdf");
        //To change body of generated methods, choose Tools | Templates.
    }

    
}
