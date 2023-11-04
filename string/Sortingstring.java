/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;


public class Sortingstring {
    public static void main(String[] args) {
        String names="Atishay,Purti,Laveena,Poornita,Parul";
        String n[]=names.split(",");
        System.out.println("original order");
        for(String name:n){
            System.out.println(name);
        }
        
        System.out.println("*******************");
        for(int i=0;i<n.length-1;i++)
        {
          for( int j=i+1;j<n.length;j++)
          {
              if(n[i].compareToIgnoreCase(n[j])>0)
              {
                  String temp;
                  temp=n[i];
                  n[i]=n[j];
                  n[j]=temp;
              }
          }
        }
        System.out.println("sorted order");
        for(String name:n){
            System.out.println(name);
        }
    }
}
