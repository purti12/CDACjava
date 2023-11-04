//2.Write a java program to Create a menu-driven interface for managing
//student grades. Users can perform the following tasks:
//1. Add students
//2. Update grades
//3. Remove students
//4. View individual grades
//5. List all students and grades
//6. Calculate the average grade for all students. Use HashMap to store student names and grades.
package collectionLabtask19;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;


public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // Map<String,Integer>sg=new HashMap<>();
        //Map<String,Integer>sg=new LinkedHashMap<>();
        Map<String,Integer>sg=new HashMap<>();
       
            System.out.println("Student grade management system");
            System.out.println("enter your choice");
            System.out.println("1:Add students");
            System.out.println("2: Update grades");
            System.out.println("3:Remove students");
            System.out.println("4: View individual grades");
            System.out.println("5: List all students and grades");
            System.out.println("6: Calculate the average grade for all students");
            System.out.println("7:Exit");
           
               int choice = sc.nextInt();
               String studentName;
               int grade;
            
            switch(choice){
                case 1:System.out.print("Enter student name grades of 5 student: ");
                for(int j=1;j<=5;j++)
                {
                 sg.put(studentName = sc.next(),grade = sc.nextInt());
                }
                     for(String s:sg.keySet())
                     {
                         Integer val=sg.get(s);
                   System.out.println("student Name:"+s+"Grades:"+val);
                  System.out.println("Student added successfully.");
                    
                     }      
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                default:  
                    
            }
            
           
            
        
//        sg.put("priya", 89);
//        sg.put("purti", 98);
//        sg.put("parul", 90);
//        sg.put("poornita", 87);
//        sg.put("sukhda", 60);
//        
//        System.out.println(sg);
//        System.out.println("student is removed:"+sg.remove("sukhda", 60));
//        
//         System.out.println(sg);
//         
//          for(String s:sg.keySet()){
//          Integer val=sg.get(s);
//            System.out.println("student:"+s+"Grades:"+val);
//        
           
            
    }
    }

