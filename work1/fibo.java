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
public class fibo {
    public static void main(String[] args){
        int a=1;
        int b=1;
        int i=1,c;
        System.out.println(a);
        System.out.println(b);
        while(i<10)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
    }
 
}
