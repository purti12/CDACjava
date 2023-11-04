/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;


public class Thread2 implements Runnable{
    
    String name;
    public Thread2(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=1;i<10;i++ ){
            System.out.println(i);
        }
            
    }
    public static void main(String[] args) {
        Thread2 t1=new Thread2("one");
        Thread2 t2=new Thread2("two");
        
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        
        th1.start();
        th2.start();
    }
}
