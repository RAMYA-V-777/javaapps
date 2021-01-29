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
public class reverse {
    private static int i;
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        //Initialize an array
        int a[]=new int[]{1,2,3,4,5,6,7,8,9,99};
        System.out.println("Original array:");
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+"");
        System.out.println();
        System.out.println("Array in reverse order:");
        for( i=a.length-1;i>=0;i--)
            System.out.println(a[i]+"");
         
    }
    
        
             
    }
    
    
}
