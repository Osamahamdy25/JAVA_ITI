/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author hp
 */
public class cd implements Retail{
   double price; 
   String name;
   String artist;

    public cd(double price, String name, String artist) {
        this.price = price;
        this.name = name;
        this.artist = artist;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    /**
     *
     * @return
     */
    @Override
   public double  getretailitem()
   {
   return  price;
   }
   
}
