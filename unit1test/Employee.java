/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit1test;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
        
class Employee
{
    String Name;
    int ID;
    int Age;
    String Designation;
    String Department;
    double Salary;
   Employee()
   {
       //Default constructor
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the name of the employee:");
       Name=obj.next();
       System.out.println("Enter the ID of the employee:");
       ID=obj.nextInt();
       System.out.println("Enter the age of the employee:");
       Age=obj.nextInt();
       System.out.println("Enter the designation of the employee:");
       Designation=obj.next();
       System.out.println("Enter the department of the employee:");
       Department=obj.next();
       System.out.println("Enter the salary of the employee:");
       Salary=obj.nextDouble();
       
   }
   Employee(String str1,int n1,int n2,String str2,String str3,double n3)
   {
       //Parameterized constructor
      Name=str1;
      ID=n1;
      Age=n2;
      Designation=str2;
      Department=str3;
      Salary=n3;
   }
   //Getter and setter methods
    String getName() {
       return Name;
   }
    void setName(String Name) {
       this.Name =Name;
   }
   int getID() {
       return ID;
   }
   void setID(int ID) {
       this.ID = ID;
   }
    int getAge() {
       return Age;
   }
    void setAge(int Age) {
       this.Age = Age;
   }
   String getDesignation() {
       return Designation;
   }
    void setDesignation(String Designation) {
       this.Designation =Designation;
   }
    String getDepartment() {
       return Department;
   }
    void setDepartment(String Department) {
       this.Department =Department;
   }
     double getSalary() {
       return Salary;
   }
    void setSalary(double Salary) {
       this.Salary =Salary;
   }
   
   
    
   public static void main(String args[])
   {
       //This object creation would call the default constructor
       Employee obj[] = new Employee[4];
       for(int i=0;i<5;i++)
       {
           obj[i]=new Employee();
        System.out.println("Employee Name is: "+obj[i].getName());
         System.out.println("Employee ID is: "+obj[i].getID());
        System.out.println("Employee Age is: "+obj[i].getAge());
         System.out.println("Employee Designation is: "+obj[i].getDesignation());
         System.out.println("Employee Department is: "+obj[i].getDepartment());
          System.out.println("Employee Salary is: "+obj[i].getSalary());
       }
       //This object creation would call the parameterized
       
       Employee obj2 = new Employee("Kaviya",30,23,"Manager","CSE",90000);
        System.out.println("Employee Name is: "+obj2.getName());
         System.out.println("Employee ID is: "+obj2.getID());
        System.out.println("Employee Age is: "+obj2.getAge());
         System.out.println("Employee Designation is: "+obj2.getDesignation());
         System.out.println("Employee Department is: "+obj2.getDepartment());
          System.out.println("Employee Salary is: "+obj2.getSalary());

  }
}
     
      

