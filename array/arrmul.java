/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class arrmul {
    public static void main(String[] args){
          Scanner obj=new Scanner(System.in);
    
        int r1,r2,c1,c2,i,j,k,tot=0;
        r1=obj.nextInt();
         r2=obj.nextInt();
          c1=obj.nextInt();
           c2=obj.nextInt();
        
        int a[][]=new int[r1][c1];
         int b[][]=new int[r2][c2];
          int c[][]=new int[r1][c2];
     if(r2==c1)
     {
        System.out.println("Arr1");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
          System.out.println("Arr2");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=obj.nextInt();
            }
        }
         for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
               for(k=0;k<c1;k++)
               {
                   tot=tot+(a[i][k]*b[k][j]);
               }
               c[i][j]=tot;
               tot=0;
            }
        }
          for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
               System.out.println(c[i][j]+"");
            }
            System.out.println();
        }
     }
          else
          {
                  System.out.println("Invalid entry");
                  }
    }
        
    

