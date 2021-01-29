/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
package inhe;

/**
 *
 * @author velmurugan
 */
public class frstprgrm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee obj=new employee();
        
    }
    
}
class employee
{
    String name="Ramya";
    int id=70;
    String address="No 9 Godzilla street madurai";
    String mailid="ramyame@gmail.com";
    int mobile =906578900;
}
class programmer extends employee
{
    int BP1;
    
    
}
class AssisstantProfesser extends employee
{
    int BP2;
}
class AssociateProfesser extends employee
{
    int BP3;
}
