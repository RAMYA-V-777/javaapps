/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;
import java.util.Scanner;
/**
 *
 * @author velmurugan
 */
//program for performing counter func using STATIC and NONSTATIC variable
public class staticvariable {
    public static void main(String[] arg){
        program obj=new program();
        System.out.println("Sample:1");
                 obj.pro();
          program obj1=new program();
           System.out.println("Sample:2");
          obj1.pro();
          
              program obj2=new program();
               System.out.println("Sample:3");
              obj2.pro();
    }
    }
    class program
    {
        static int a=50;//static variable
        int b=10;//normal variable
        void pro()
        {
            a=a*50;
            b=b*50;
            System.out.println(a);        
            System.out.println(b); 
        }
    }
  
    

