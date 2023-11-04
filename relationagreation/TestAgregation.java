/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relationagreation;
class College{
private String name;
private Department departs[];

    public College(String name, Department[] departs) {
        this.name = name;
        this.departs = departs;
    }
    void collegeDetails(){
        
        System.out.println("collegeDetails");
        System.out.println("name="+name);
        for(Department d:departs)
            System.out.println(d);
                
}
}
class Department{
    private String name;
    private int capacity;

    public Department(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

        @Override
        public String toString() {
            return "Department{" + "name=" + name + ", capacity=" + capacity + '}';
        }
    
}
public class TestAgregation {
    public static void main(String[] args){
    Department dept[]={new Department("IT",300),new Department("Mechanical",300),new Department("Civil",300),new Department("Electrical",300),new Department("AI",300)};
    Department dept1[]={new Department("IT",200),new Department("Mechanical",200),new Department("Civil",200),new Department("AI",300)};
    College c=new College("YCEE",dept);
    College c1=new College("kITS",dept1);
    c.collegeDetails();
    System.out.println("*******************************");
    c1.collegeDetails();
    }
       
    }

