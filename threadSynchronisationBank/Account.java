/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadSynchronisationBank;


public class Account {
    private int balance=10000;
    
    public boolean isSufficientBalance(int amount){
        if(balance<amount)
            return false;
        else 
            return true;
    }
            
    
    public void withdraw(int amount)
    {
     
        balance=balance-amount;
          System.out.println("Remmaining balance is "+balance+"/-");
       }
    public void deposit(int amount)
    {
        balance=amount+balance;
    }
      
}
