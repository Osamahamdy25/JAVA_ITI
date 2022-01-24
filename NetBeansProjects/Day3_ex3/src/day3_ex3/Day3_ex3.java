/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
/**
 *
 * @author AHelal
 */
public class Day3_ex3 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics g){
        resize(500,500);
        g.setColor(new Color(0xF3,0xF7,0x81)); // light yellow color
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
    }
    // TODO overwrite start(), stop() and destroy() methods
}
