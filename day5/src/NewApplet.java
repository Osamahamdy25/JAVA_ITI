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
    
    int x, y, oldx, oldy, count,flag;

    
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        flag=0;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawLine(x, y, oldx, oldy);
    }
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void mouseClicked(MouseEvent me) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        x=me.getX();
        y=me.getY();
        
        //repaint();
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
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
        
        oldx=me.getX();
        oldy=me.getY();
        repaint();
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
