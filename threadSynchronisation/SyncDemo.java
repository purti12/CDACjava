/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadSynchronisation;

 class SyncDemo implements Runnable{
 static int x=0;
    @Override
    public void run() {
        synchronized (this) {//now the output will be 0 becoz we put loop in synchronized
            
        
       for(int i=0;i<1000;i++){
           x++;//1
           x--;//0
       }
        }
        
    }
     public static void main(String[] args) {
         SyncDemo sd=new SyncDemo();
         
         Thread th[]=new Thread[100];
         for(int i=0;i<th.length;i++)
         {
             th[i]=new Thread(sd);
             th[i].start();
         }
             System.out.println("final value of x is " +x);//we cannnot gaurantee whatwill be the output it depends on processor for that weneedto synchronised
     }
}
