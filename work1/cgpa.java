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
public class cgpa {
    private static int i;
    
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
       System.out.println("Enter n:");
       int n= obj.nextInt();
       int m[]=new int[n];
       int g[]=new int[n];
       double cgpa,sum=0;
       System.out.println("Marks");
        for(i=0;i<n;i++)
       {
          m[i]=obj.nextInt();
          
       }
      
       System.out.println();
       for(i=0;i<n;i++)
               {
                   g[i]=m[i]/10;
               }
       for(i=0;i<n;i++)
       {
           sum=sum+g[i];
       }
       cgpa=sum/n;
       System.out.println("cgpa"+cgpa);
                   
               
       
       
    }
    
}
