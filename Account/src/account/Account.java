/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author muhammadsaim
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Accounts user = new Accounts(-45.0);
        
        user.deposit(500);
        double ammount = user.getBalance();
        System.out.println("Your Total Balance is "+ammount);
        
    }
    
}
