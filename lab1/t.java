/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author velmurugan
 */
public class t

{

public static void main(String[] args)

{

          labell: for (int i=0; i<5; ++i)

                     label2: for (int j=0; j<3; ++j)

                     {

                      if (j<=i)

                       {

                       System.out.print(j);

                       continue labell;

                      }

                   else

                  break label2; } } }