/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package-collection of class,interface and methods
adv- maintain,protection,no name collision,2 types-user,inbuilt
userdefined inbuilt->import java.io.*-to read input and output
import java.util.*-for time func
import java.net.*-for net,communicate b/w two devices
import java.awt.*-for develop GUI(ABSTRACT WINDOW TOLGATE)
syntax:
 package packagename;
import packagename.*-(* for all info otherwise give only classname)
folder is a package where we are collecting programs with no of classeswhich has methods
so package is a collection of classes
subpackage-folder inside a folder

*/
package array;
import pack1.*;
import pack1.subpackage.*;

/**
 *
 * @author velmurugan
 */
public class package1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frst s=new frst();
        s.display();
        scd s1=new scd();
        s1.display();
        trd s3=new trd();
        s3.display();
    }
    
}
