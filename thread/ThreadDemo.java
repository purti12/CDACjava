
package thread;


public class ThreadDemo extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
//            if(this.getName().equals("second"))
//            {
//                try{
//                    sleep(5000);
//                }
//                catch(Exception e){}
//                }
            
            System.out.println(this.getName()+i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        ThreadDemo td1=new ThreadDemo();
        ThreadDemo td2=new ThreadDemo();//newly born stage
        
        
        td1.setName("first");
        td2.setName("second");//ready to run
        
        td1.start();
        td2.start();//ready to run
        
        
    }
    
}
