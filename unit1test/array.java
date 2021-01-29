/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit1test;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ele,flag=0, i=0,large,small;
        Scanner obj=new Scanner(System.in);
        
              System.out.println("Ener the no of terms");
              int n=obj.nextInt();
              System.out.println("Enter the terms");
              int m[]=new int[n];
              for( i=0;i<n;i++)
              {
                  m[i]=obj.nextInt();
              }
              System.out.println("The array will be displayed as:");
              for( i=0;i<n;i++)
              {
                  System.out.println(m[i]);
              }
              System.out.println("Array in reverse order:");
        for( i=m.length-1;i>=0;i--)
        {
            System.out.println(m[i]+"");
        }
        System.out.println("Enter the element ypu want to search in the given array:");
        ele=obj.nextInt();
        for( i=0;i<n;i++)
        {
            if(m[i]==ele)
            {
                flag=1;
                        break;
            }
            else
                flag=0;
        }
        if(flag==1)
        {
            System.out.println("Element found at position:"+(i+1));
            }
        else
            System.out.println("Element not found");
        large=small=m[0];
               for(i=0;i<n;i++)
    {
        if(m[i]>large)
            large=m[i];
        if(m[i]<small)
            small=m[i];
    }
     System.out.println("\nThe smallest element in the array is:"+small);
      System.out.println("\nThe largest element in the array is:"+large);
             
    }
    }


    

