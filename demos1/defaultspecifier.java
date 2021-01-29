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
public class defaultspecifier {
 public static void main(String[] args){
     defspc obj=new defspc();
     obj.display();
 }   
}
class defspc//exception case @demos.test.......test case@demos1.examplr
{
    int a=10;
    int b=20;
    void display()
    {
        System.out.println(a+b);
    }
}