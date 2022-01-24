/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_ex1;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author hp
 */
public class Day3_ex1 extends Applet{

   @Override
   public void paint (Graphics g)
   { 
      String [] f_names;       
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      f_names=ge.getAvailableFontFamilyNames();
      Font f;
      int y=50;
       for (String i : f_names) {
           f=new Font(i,1,20);
            g.setFont(f);
            g.drawString(i,10, y);
            y+=20;
        }
       }
   }
    
