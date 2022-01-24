package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fazecast.jSerialComm.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connect {
    SerialPort comPort;
    Scanner sc;
   
    public connect(){
        comPort = SerialPort.getCommPort("COM5");
        comPort.openPort();
        comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
    }
    
    public void sendData(int data){
        
       
            
            
        
        OutputStream out = comPort.getOutputStream();
        
       
        try {
            out.write(data);
           // out.close();
        } catch (IOException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        //comPort.closePort();
    }
    
    public int readData(){
        int data = 0;
        InputStream in = comPort.getInputStream();
       
         
        try {
           data= in.read();
          // in.close();
        } catch (IOException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
       // comPort.closePort();
     return data;   
    }
    
}
