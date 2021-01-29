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
public class countprgrm {
  
    private static int i;
    private static int count1;
    private static int count2;
    private static int count3;
  
    public static void main(String[] args){
               
              Scanner obj=new Scanner(System.in);
              System.out.println("Ener the no of terms");
              int n=obj.nextInt();
              System.out.println("Enter the terms");
              int m[]=new int[n];
              for(i=0;i<n;i++)
              {
                  m[i]=obj.nextInt();
              }
       for(i=0;i<n;)
       {
            if(m[i]>0)
            {
                count1=count1+1;
                i++;
            }
       
            else if(m[i]<0)
            {
                count2=count2+1;
                i++;
            }
            else
            {
                count3=count3+1;
                i++;
            }
            
       }
       System.out.println("no of positive terms:"+count1);
            System.out.println("no of negative terms"+count2);
            System.out.println("no of zero;s"+count3);
    } }
                
                
        
         
             
        
    
}
