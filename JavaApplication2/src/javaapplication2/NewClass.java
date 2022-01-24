/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author hp
 */
  class Comp {
    private int real;
    private int imag;
    
    public Comp(){}
    public void set_real(int r)
    {
        real = r ;
    }
    public void set_imag(int i)
    {
        imag = i ;
    }
    public int get_real()
    {
        return real;
    }
    public int get_imag()
    {
        return imag;
    }
    public Comp(int r,int i)
    {
        real = r;
        imag = i;
    }
    public Comp add(Comp c) {
        Comp temp = new Comp();
        temp.real=real+c.real;
        temp.imag=imag+c.imag;
        return temp;
    }
    public Comp supp(Comp c){
        
        Comp temp = new Comp();
        temp.real=real-c.real;
        temp.imag=imag-c.imag;
        return temp;
    }
}
public class NewClass {
    
    
    
    
}
