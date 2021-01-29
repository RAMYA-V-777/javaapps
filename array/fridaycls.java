/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;

/**
 *
 * @author velmurugan
 */
public class fridaycls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int a[]=new int[3];
        //jadded array-each row is different
        int b1[][]=new int[][]{(1,2,3,4),(5,6),(7,8,9),(1,2,3,4,5)};
        for(int i=0;i<b1.length;i++)
        {
            for(int j=0;j<b1.length;j++)
            {
                System.out.print(b1 [i][j]);
            }
            System.out.println();
        }
        for(int i[]:b1)//extended for loop or for each loop
        {
             for(int j:i)
        }
    }
    
}
