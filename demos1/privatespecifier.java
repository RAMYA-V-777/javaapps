/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demos1;

/**
 *
 * @author velmurugan
 */
public class privatespecifier {
    public static void main(String[] args){
        prispc obj=new prispc();
        obj.display();
    }
    
}
class prispc
{
    private int a=10;
    int b=20;/*private prispc().........>exception case i.e.,constructor as PRIVATE cant create obj for that class
    {
    System.out.println("Constructor...");
    }*/
    void display()
    {
        System.out.println(a+b);
    }
    
    }

