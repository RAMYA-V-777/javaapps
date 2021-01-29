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
public class greatestof3 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of a b andc");
        int a=obj.nextInt();
       int b=obj.nextInt();
        int c=obj.nextInt();
        if((a>b)&&(a>c))
            System.out.println("A is the greatest number");
        else if((b>a)&&(b>c)) 
             System.out.println("B is the greatest number");
        else
         System.out.println("C is the greatest number");
    }
    
    
}
