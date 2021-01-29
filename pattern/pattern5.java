/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author velmurugan
 */
public class pattern5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j, k;

    for (i = 1; i <= 5; i++)
    {
        for (j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
        for (k = 1; k <= 2 * i - 1; k++)
        {
            System.out.print(" "+i);
        }
        System.out.println("");
    }

    }
    
}
