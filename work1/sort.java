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
public class sort {
    private static int i;
    private static int j;
    private static int c;
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter the no of terms");
        int n=obj.nextInt();
       
              System.out.println("Enter the terms");
         int m[]=new int[n];
         for(i=0;i<n;i++)
         {
             m[i]=obj.nextInt();
            
         }
          for(i=0;i<n;i++)
          {
              for(j=i+1;j<n;j++)
                  if(m[i]>m[j])
              {
                  c=m[i];
                  m[i]=m[j];
                  m[j]=c;
              }
          }
           for(i=0;i<n;i++)
           {
                System.out.println(""+m[i]);
           }
          System.out.println(""+m[n-1]);
    }
    
}
