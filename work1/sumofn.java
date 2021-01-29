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
public class sumofn {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int i=0,sum=0,x;
        System.out.println("Enter the no:");
        int n=obj.nextInt();
        while(i<=n)
        {
               sum=sum+i;
               i=i+1;
        }
               System.out.println(sum);
        
        
        }
            
        }
        
    
}
