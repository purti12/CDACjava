/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadSynchronisationBank;


public class Bank {
    public static void main(String[] args) {
        Account acc= new Account();
        Customer c1=new Customer("ram", acc);
        Customer c2=new Customer("sham", acc);
        
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        
        t1.start();
        t2.start();
    }
    
}
