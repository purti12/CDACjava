
package iotest.serial;

import java.io.*;
class Student implements Serializable{
   String name;
    int age;
    transient String password;
    public Student(String name,int age,String password){
        this.name=name;
        this.age=age;
        this.password=password;
        
    }
}

public class TestSerilization {
    public static void main(String[] args) {
        try(FileOutputStream fout=new FileOutputStream("stud.ser");
                ObjectOutputStream oos=new ObjectOutputStream(fout)) {
                    Student student =new Student("purti",28,"pu");
                    oos.writeObject(student);
                    System.out.println("object serialized successfully..");}
                    catch(Exception e){
                            System.out.println(e.getMessage());
                            }
                }
    }
   

