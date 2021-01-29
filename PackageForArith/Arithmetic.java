/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackageForArith;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class Arithmetic {
    public void arith()
    {
          int a;
          int b;
          Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=s.nextInt();
        System.out.println("Enter the value of b:");
        b=s.nextInt();
        System.out.println("Arithmetic operations are as follows:");
         System.out.println("ADDITION");
         int add=a+b;
        System.out.println("The sum of two numbers a and b is:"+add);
         System.out.println("SUBTRACTION");
         int sub=a-b;
        System.out.println("The difference of two numbers a and b is:"+sub);
         System.out.println("MULTIPLICATION");
         int mul=a*b;
        System.out.println("The product of two numbers a and b is:"+mul);
         System.out.println("DIVISION");
          int div=a/b;
        System.out.println("The division of two numbers a and b is:"+div);
         System.out.println("MODULUS");
          int mod=a%b;
        System.out.println("The modulus of two numbers a and b is:"+mod);
         
    }
    
}
