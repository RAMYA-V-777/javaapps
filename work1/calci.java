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
public class calci {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a and b");
        int a=obj.nextInt();
        int b=obj.nextInt(); 
        char c=obj.next().charAt(0);
        switch(c)
        {
            case  '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break; 
             case '*':
                System.out.println(a*b);
                break;
             case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid");
                
        }
                
        }
        
    }
            

