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
public class distance {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter x1,x2,y1,y2");
        int x1=obj.nextInt();
        int x2=obj.nextInt();
        int y1=obj.nextInt();
        int y2=obj.nextInt();
        
        double distance =Math.sqrt((x2-x1^2)+(y2-y1)^2);
        System.out.println(distance);
    }
    
}
