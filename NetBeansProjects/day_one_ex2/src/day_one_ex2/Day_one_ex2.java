/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day_one_ex2;

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
public class Day_one_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comp c=new Comp(15,10);
        Comp c2=new Comp(10,10);
        Comp res=new Comp();
        res=c.add(c2);
        System.out.println(res.get_real()+"+"+res.get_imag()+"i");
    }
    
}
