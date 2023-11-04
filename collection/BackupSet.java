/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class BackupSet {
    public static void main(String[] args) {
        Set<Integer>originalset=new HashSet<>();
        
        originalset.add(200);
        originalset.add(100);
        originalset.add(300);
        //Set<Integer>backupset=Collections.unmodifiableSet(new HashSet<>(originalset));//it doesnt allow to modify anything
 Set<Integer>backupset=new HashSet<>(originalset);//it allowsto modify in backup list
        System.out.println(originalset);
        System.out.println(backupset);
        
        try{
            backupset.add(500);
        }
        catch(Exception e){}
         System.out.println(originalset);
        System.out.println(backupset);
    }
            
    
}
