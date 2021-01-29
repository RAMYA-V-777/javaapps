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
public class prodiscount {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter amount and discount");
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        double amount=a/100*b;
        System.out.println("Commision amount"+(a-amount));
    }
    
}
