//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.

//Provide public getter and setter methods to access and modify the id and name variables,

import java.util.Scanner;;
public class Encapsulation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Employee em=new Employee();

        System.out.println("Enter Employee Id :");
        em.setEmployee_id(sc.nextInt());

        System.out.println("Enter Eployee Name :");
        em.setEmployee_name(sc.next());

        System.out.println("Enter Employee salary :");
        em.setEmployee_salary(sc.nextLong());

        // get Employee details

        System.out.println("Name of Eployee :"+em.getEmployee_name());
        System.out.println("Id of Employee :"+em.getEmployee_id());
        System.out.println("Salary of Employee :"+em.getEmployee_salary());



    }

    
}


class Employee{

    private int employee_id;
    private String employee_name;
    private long employee_salary;


    public int getEmployee_id() {
        return employee_id;
    }


    public String getEmployee_name() {
        return employee_name;
    }

    public long getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployee_salary(long employee_salary) {
        this.employee_salary = employee_salary;
    }




}
