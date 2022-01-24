/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.practice;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author hp
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        
    }
    @Override
    public void paint (Graphics g)
    {
    g.drawString("Osama Hamdy",50,100);
    }
}
