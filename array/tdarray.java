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
public class tdarray {
    public static void main(String[] args){
        int row=3,col=3,i,j;
        int a[][]=new int[row][col];
         int b[][]=new int[row][col];
          int c[][]=new int[row][col];
        Scanner obj=new Scanner(System.in);
        System.out.println("Arr1");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
          System.out.println("Arr2");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                b[i][j]=obj.nextInt();
            }
        }
          System.out.println("Add");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
          System.out.println("Result");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(c[i][j]+"");
            }
            System.out.println();
        }
    }
    
}
