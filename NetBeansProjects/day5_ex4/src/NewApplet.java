/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/**
 *
 * @author WINDOWS
 */

public class NewApplet extends Applet implements MouseListener, MouseMotionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int c,c2;
    int[] x = new int[10];
    int[] y = new int[10];
    int[] oldy = new int[10];
    int[] oldx = new int[10];
    

    
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        c=0;c2=0;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    public void paint(Graphics g)
    {
        for(int i=0;i<10;i++)
        g.drawLine(x[i], y[i], oldx[i], oldy[i]);
    }
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void mouseClicked(MouseEvent me) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if(c<10)
        
        {    
            x[c]=me.getX();
            y[c]=me.getY();
            c++;
        }
        //repaint();
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        if(c2<10)
        {
            c2++;
            repaint();
        }
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if(c2<10)
        {
            oldx[c2]=me.getX();
            oldy[c2]=me.getY();
        }
        
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) {
         //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param 
     */
    
   
}
