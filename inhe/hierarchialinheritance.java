/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inhe;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class hierarchialinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stu1 obj=new stu1();
        obj.getstu1details();
        //obj.getbookdetails();
        obj.show();
    }
    
}
class book
{
    String name;
    int accno;
    String author;
    Scanner obj=new Scanner(System.in);
    public void getbookdetails()
    {
        System.out.println("Enter the name:");
        name=obj.next();
        System.out.println("Enter the access no::");
        accno=obj.nextInt();
        System.out.println("Enter the author name:");
        author=obj.next();
    }
    public void show()
    {
         System.out.println("Name"+name);
          System.out.println("Accno:"+accno);
           System.out.println("Author"+author);
         
    }
}
class stu1 extends book
{
    String name,rollno,dept;
    public void getstu1details()
    {
        super.getbookdetails();
        System.out.println("Name"+name);
        name=obj.next();
        System.out.println("Name"+rollno);
         rollno=obj.next();
         System.out.println("Name"+dept);
         dept=obj.next();
    }
    public void show()
    {
        super.show();
         System.out.println("Studentname"+name);
          System.out.println("rollno"+rollno);
           System.out.println("dept"+dept);
    }
}
class staff extends book
{
    String name,sid,dept;
    public void staffdetails()
    {
        super.getbookdetails();
        name=obj.next();
         sid=obj.next();
         dept=obj.next();
    }
        public void show()
        {
            super.show();
            System.out.println("Stfname"+name);
          System.out.println("sid"+sid);
           System.out.println("dept"+dept);
        }
            
              
}