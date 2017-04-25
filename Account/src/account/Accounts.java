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
public class Accounts {
    
     //Balance of the user
    private double balanace;
    
    //constructor
    public Accounts(double initBalance){
        this.balanace = (initBalance>0.0 ? initBalance : 0);
    }//construtor ends here
    
    public void deposit(double depositBalance){
        
        this.balanace += depositBalance;
          
    }//ends deposit method here
    
    public double getBalance(){
        return this.balanace;
    }//ends getBalance
    
}
