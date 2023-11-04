/*


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerannoymous;

class c{
    void greeting(){
        System.out.println("Say hello.............");
    }
}
class Outerofannonymous{
    c p=new c(){
        @Override
        void greeting() {
            
            System.out.println("say namaste........");
        }
    };
            
            
}
        
public class Testannoymous {
    public static void main(String[] args) {
        Outerofannonymous o=new Outerofannonymous();
        o.p.greeting();
    }
}
