/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packagedemo.pack2;


public class Seconddemo extends packagedemo.pack1.Firstdemo{
    int y=20;
    int x=10;
    public void show(){
      packagedemo.pack1.Firstdemo f=new packagedemo.pack1.Firstdemo();
      
      
      System.out.println("from pack2"+(y+x));
}
}
