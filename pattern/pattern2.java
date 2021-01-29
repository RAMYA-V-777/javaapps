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
public class pattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        for(x=1;x<=4;x++)
        {
            for(y=1;y<=x;y++)
            {
                System.out.print(" "+y);
            }
            System.out.println();
        }
    }
    
}
