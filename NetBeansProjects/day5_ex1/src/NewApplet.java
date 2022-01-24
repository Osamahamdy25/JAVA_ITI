/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WINDOWS
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int x;
    Button a,b;
    public void init() {
        // TODO start asynchronous download of heavy resources
        a=new Button("Increment");
        b=new Button("Decrement");
        a.addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev)
            {
                if(x<10)
                x++;
                repaint();
            }

            private void repaint() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        );
        b.addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev)
            {
                if(x>0)
                    x--;
                repaint();
            }

            private void repaint() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        );
        add(a);
        add(b);
    }
    public void paint(Graphics g)
    {
        g.drawString("Click Count is:"+x, 50, 200);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
