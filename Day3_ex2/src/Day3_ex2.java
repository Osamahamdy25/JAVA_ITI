/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author AHelal
 */
public class Day3_ex2 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Image picture;
   
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        picture = getImage(getCodeBase(),"osama.jpg"); 
    }
    @Override
    public void paint(Graphics g){
        
    /*    BufferedImage img = null;
        try
           {
            img = ImageIO.read(new File("osama.jpg"));
           }
        catch (IOException ex)
        {
            Logger.getLogger(Day3_ex2.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        if(g.drawImage(picture,0,0,this))
        {
            g.drawImage(picture,0,0,this);
            g.drawImage(picture, 0, 0,this.getWidth(),this.getHeight(),this); 
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
}

