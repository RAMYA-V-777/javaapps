/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit11;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class boool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        arg obj=new arg();
        boolean c=arg.maj(true,false,false);
        if(c==true)
          System.out.println("True");
        else
            System.out.println("False");
    }
    class arg{
        static boolean maj(boolean a,boolean b,boolean c)
        {
            if(a==true && b==true)
                return true;
            else if(b==true && c==true)
                return true;
            else
                return false;
        }
        }
    }
    

