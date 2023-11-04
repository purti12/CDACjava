/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread.deadlock;


public class DeadlockDemo {
    public static void main(String[] args) {
        String rec1="purti";
        String rec2="parul";
        
        Thread t1=new Thread(){
            @Override
            public void run()   
            {
                synchronized (rec1)
                {
                    System.out.println("Thread  1 uses resources 1 "+rec1);
                    try
                    {    
                    sleep(100);
                    }
                    catch(Exception e){}
                
                }
                    synchronized (rec2)
                    {
                        System.out.println("Thread  1 require resources 2 also "+rec2);    
                    }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run()   
            {
                synchronized (rec1)
                {
                    System.out.println("Thread  2 uses resources 2 "+rec2);
                    try
                    {    
                    sleep(100);
                    }
                    catch(Exception e){}
                
                }
                    synchronized (rec2)
                    {
                        System.out.println("Thread  2 require resources 1 also "+rec1);    
                    }
            }
        };
        t1.start();
        t2.start();
    }
}
