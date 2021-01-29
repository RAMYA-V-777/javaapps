/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;
import java.util.*;
class search1
{
     boolean flag=false;
     void search(int a[],int key)
     {
          for(int i=0;i<a.length;i++)//if b instead of a both have same memory location
          {
               if(a[i]==key);
               {
                   flag=true;
               }
          }
          if(flag)
              System.out.println("Element found");
          else
              System.out.println("Element not found");
     }
}

/**
 *
 * @author velmurugan
 */
public class searcharray {
    public static void main(String[] args){
        search1 obj=new search1();
        int a[]={2,5,17,9,0};
        System.out.println(a.length);
         obj.search(a,90);
    }
    
}
