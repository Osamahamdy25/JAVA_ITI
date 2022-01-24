/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.practice;
import java.util.Scanner;
/**
 *
 * @author hp
 */
class  serrated_disk
{
    private int size; 
    private int num_of_pins;
   private static String comname;
   public void set_size(int s)
   {
      this.size=s;
   }
   public int get_size()
   {
      return size;
   }
    public void set_numofpins(int n)
   {
      this.num_of_pins=n;
   }
   public int get_numofpins()
   {
      return num_of_pins;
   }
   public static void company_namy(String name)
   {
   
   comname=name;
   
   }     
   public static String getcom_name()
   {
        return comname;
   }
     public serrated_disk(int s,int n )
    {
       this.size=s;
       this.num_of_pins=n;        
    }
    public void spin()
    {
            System.out.println("the disk is spinning now ");
    }

 
}
public class CodingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* serrated_disk my_car;
       my_car = new serrated_disk(5,50);
       my_car.spin();
       serrated_disk.company_namy("hello from main class");
       String name;
        name = serrated_disk.getcom_name();
        System.out.println(name);
        my_car.set_size(50);
        int size= my_car.get_size();
           System.out.println(size);   */
     Scanner input= new Scanner(System.in);
    /* char pass_class; 
     double ex_weight=0,charge = 0;
     double bagWeight;
     int num_of_passengers = 0,groups;
        System.err.println("please enter number of passengers");
        num_of_passengers=input.nextInt();
     for(int i=0;i<num_of_passengers;i++)
     {
        System.err.println("please enter the passage class no "+i);
        pass_class=input.next().charAt(0);
        System.out.println("please enter the weight");
        bagWeight=input.nextDouble();
        switch (pass_class)
        { 
            case 'f':
            case 'F': 
                if(bagWeight>30)
                {
                    ex_weight=bagWeight-30;
                 charge=ex_weight*10;
                }
                break;
            case 'b':
           case 'B': 
                if(bagWeight>25)
                {
                    ex_weight=bagWeight-25;
                 charge=ex_weight*10;
                }
                break;
                case 'e':
                case 'E': 
                if(bagWeight>20)
                {
                    ex_weight=bagWeight-20;
                 charge=ex_weight*10;
                }
                break;
                default : 
                    System.out.println("you entered invalid class");
        
        }
        System.out.println("you have to pay extra charge = "+ charge);
     } */ 
     String str="hi";
     @SuppressWarnings("RedundantStringConstructorCall")
     String Str2=new String("hi");
     System.out.println(str.equals(Str2));
  
    }
}
