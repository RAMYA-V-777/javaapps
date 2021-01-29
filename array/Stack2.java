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
public class Stack2 {
    public static void main(String[] args){
         
        //switch or do while
      /*  obj.push(3);
        obj.push(2);
        obj.push(4);
        obj.push(5);
        obj.push(7);
       obj.push(8);
      
        
       System.out.println( obj.pop());
       
        obj.display();*/
       
       
         Scanner s=new Scanner(System.in);
         int max=s.nextInt();
        stack obj=new stack(max);
        int choice,i;
        char ch;
        do{
        System.out.println("1.push\n2.pop\n3.display");
        choice=s.nextInt();
        switch(choice)
        {
            case 1:if(!obj.isfull())
            {
                   System.out.println("Enter element to insert");
                   i=s.nextInt();
                   obj.push(i);
            }
            else
                  System.out.println("Stack is full");
                break;
            case 2:
                if(!obj.isempty())
                {
                      System.out.println("Deleted element"+obj.pop());
                }
            else
                      System.out.println("empty stack");
                break;
            case 3:
                obj.display();
                break;
            default:
                  System.out.println("Enter option from 1 to 3");
                break;
            }
        System.out.println("Do u want to conitue");
        ch=s.next().charAt(0);
        }while(ch=='y'||ch=='Y');
    }
  }

class stack//LIFO
{
    int top=-1;
    int a[];
    int max;
    stack(int n)
    {
        max=n;
        a=new int[max];
        
    }
    
    void push(int i) //insertion
    {
        a[++top]=i;//top=-1 //top=0//a[0]=9
    }
    int pop()//deletion
    {
         return a[top--];//top=0//a[0]=9//top=-1
    }
    boolean isfull()
    {
      return top==max-1;
    }
    boolean isempty()
    {
        return top==-1;
    }
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
