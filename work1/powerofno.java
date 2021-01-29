/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package work1;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class powerofno {
   
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the base number");
        int a=obj.nextInt();
           System.out.println("Enter the power");
           int b=obj.nextInt();
           long c=1;
           
     
     while(b!=0)
     {
         c=c*a;
         --b;
     }
         System.out.println("Answer is"+c);
         
    }
    
    
}
