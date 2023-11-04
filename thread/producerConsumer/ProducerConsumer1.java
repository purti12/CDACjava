package thread.producerConsumer;

import java.nio.Buffer;
import java.util.Vector;

class Producer implements Runnable
{
    private final Vector buffer;
    private final int SIZE;

    public Producer(Vector buffer, int SIZE) 
    {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
    public void produce(int i)throws InterruptedException
    {
        if(buffer.size()==SIZE)
        {
            synchronized (buffer) 
            {
                System.out.println("the buffer isfull andwaiting to consume item"+buffer.size());
                buffer.wait();//blocked production
            }
        }
    synchronized (buffer)
    {
        buffer.add(i);
        buffer.notifyAll();//unblock consumer
    }
}
    @Override
    public void run() 
    {
        for(int i=1;i<10;i++)
        {
            try
            {
                produce(i);
            }
            catch(Exception e){}
                
            System.out.println("produced items "+i);
        }
    }
}
class Consumer implements Runnable
{
    private final Vector buffer;
    private final int SIZE; 

    public Consumer(Vector buffer, int SIZE) 
    {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
    
    public int consume() throws InterruptedException
    {
        if(buffer.isEmpty())
        {
            synchronized(buffer)
            {
                System.out.println("The buffer is empty and waiting to produce item "+buffer.size());
                buffer.wait();//block consumer
            }
        }
            synchronized (buffer)
            {
                buffer.notifyAll();
                return (Integer)buffer.remove(0);
            }
        
    }

    @Override
    public void run() {
         while(true)//jitna production hai utna hi chlega
        {
            try{
                System.out.println("consumed item "+consume());
                Thread.sleep(100);
            }
            catch(Exception e){}
        }
    }
    }
    
    
    
public class ProducerConsumer1 {
    public static void main(String[] args) {
         Vector buff=new Vector();
         int size=5;
         
         Producer prod=new Producer(buff,size);
         Consumer cons=new Consumer(buff,size);
         
         Thread t1=new Thread(prod);
         Thread t2=new Thread(cons);
         
         t1.start();
         t2.start();
         
         
         
    }
}
