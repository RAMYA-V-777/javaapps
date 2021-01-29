/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit1test;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class Invoiceunittest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        owner w1=new owner("Teena","Mumbai","Doctor");
        System.out.println(w1.getname());
        System.out.println(w1.getcity());
        System.out.println(w1.getprof());
        System.out.println(w1);
        
        car c1=new car(100,"Blue",340,"Benz",12,w1);
                System.out.println(c1.getno());
                System.out.println(c1.getclr());
                System.out.println(c1.getseats());
                System.out.println(c1.getbrd());
                System.out.println(c1.getmod());
                System.out.println(c1.getowner());
                owner w2=new owner("Reena","Madurai","Collector");
                        c1.setowner(w2);
                        System.out.println(c1.getno());
                        System.out.println(c1.getclr());
                        System.out.println(c1.getbrd());
                        System.out.println(c1.getmod());
                        System.out.println(w1.getname());
    }
    
}
class owner{
    String name;
    String city;
    String prof;
         owner(String n,String c,String p)
         {
             name=n;
             city=c;
             prof=p;
         }
         String getname()
         {
             return name;
         }
         String getcity()
         {
             return city;
         }
         String getprof()
         {
             return prof;
         }
         public String toString()
         {
             return "\nName:"+name+"\nCity"+city+"\nProf"+prof;
         }
}
class car
{
     int no;
      String clr;
      int seats;
      String brd;
      int mod;
      owner w;
      car(int n1,String l,int s,String b,int m,owner w3)
      {
          no=n1;
          clr=l;
          seats=s;
          brd=b;
          mod=m;
          w=w3;
          
      }
      int getno()
      {
           return no;
      }
      String getclr()
      {
          return clr;
      }
      int getseats()
      {
          return seats;
      }
      String getbrd()
      {
          return brd;
      }
      int getmod()
      {
          return mod;
      }
      owner getowner()
      {
          return w;
      }
      void setowner(owner w4)
      {
          w=w4;
      }
      
      
}