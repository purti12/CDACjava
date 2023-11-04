/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;


public class Employtask7 {
 
    private int empId;
    private String empName;
    private double empSalary;

    public Employtask7 (int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public static void main(String[] args) {
        
       Employtask7 employee1 = new Employtask7 (1, "parul", 50000.0);
       Employtask7  employee2 = new Employtask7 (2, "purti", 60000.0);
        

      Employtask7 [] employeeArray = {employee1, employee2};

        
        for (Employtask7  employee : employeeArray) {
            System.out.println("Employee ID: " + employee.getEmpId() +
                               ", Name: " + employee.getEmpName() +
                               ", Salary: " + employee.getEmpSalary());
        }
    }
}


