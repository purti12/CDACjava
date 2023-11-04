/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambda;
@FunctionalInterface
        
interface Lengthfinder{
    int strLength(String str);
}

public class Testlambdaexp {
    public static void main(String[] args) {
        Lengthfinder lf=(str)->str.length();
        System.out.println("length is "+lf.strLength(" purti katariya"));
        
        Runnable r;
        r = ()->{
            for(int i=0;i<=10;i++){
                System.out.println("i="+i);
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException ex){
                    
                }
            }
   
        };
        r.run();
    }
}
        
    
        


