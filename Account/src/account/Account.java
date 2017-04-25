/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import java.util.Scanner;

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
        
        double ammount;
        
        Accounts user = new Accounts(100.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Ammount to Deposit: ");
        ammount = scanner.nextDouble();
        user.deposit(ammount);
        ammount = user.getBalance();
        System.out.println("Your Total Balance is "+ammount);
        
    }
    
}
