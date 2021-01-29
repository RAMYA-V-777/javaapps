/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mainpackage1;//FIRST SIMPLE PACKAGE FOR ACCESSING PACKAGE1 AND ITS SUBPACKAGE AS GIVEN
import package1.*;
import package1.subpackage1.*;
import package2.*;
import package2.subpackage2.*;

/**
 *
 * @author velmurugan
 */
public class PackageForAccessingPackage1AndItsSubpackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ACCESSING PACKAGE-1
        prgrm1 s=new prgrm1();
        s.display1();
        prgrm2 s1=new prgrm2();
        s1.display2();
        prgrm3 s3=new prgrm3();
        s3.display3();
        //ACCESSING SUBPACKAGE-1 IN PACKAGE-1
        Prgrm4 s4=new Prgrm4();
        s4.present1();
         Prgrm5 s5=new Prgrm5();
        s5.present2();
         Prgrm6 s6=new Prgrm6();
        s6.present3();
        //ACCESSING PACKAGE-2
        prgrm7 s7=new prgrm7();
        s7.given1();
         prgrm8 s8=new prgrm8();
        s8.given2();
         prgrm9 s9=new prgrm9();
        s9.given3();
        //ACCESSING SUBPACKAGE-2 IN PACKAGAE-2
         prgrm10 s10=new prgrm10();
        s10.view1();
         prgrm11 s11=new prgrm11();
        s11.view2();
         prgrm12 s12=new prgrm12();
        s12.view3();
        
    }
    
}
/*
First program in package-1
Second program in package-1
Third program in package-1
First subpackage in package-1
Second subpackage in package-1
Third subpackage in package-1
First program in package-2
Second program in package-2
Third program in package-2
First program in subpackage-2
Second program in subpackage-2
Third program in subpackage-2
BUILD SUCCESSFUL (total time: 1 second)
*/
