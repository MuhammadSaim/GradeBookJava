/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

/**
 *
 * @author muhammadsaim
 */
public class GradeBooks {
    private String cn ;
    
    
    
    //creating constructors
    public GradeBooks(){
//        this.cn = courceName;
    }
    public GradeBooks(String courceName){
        this.cn = courceName;
    }
    /*
        here `this` is a keyword which is telling
        or reference the class property cn
    */
   
   
    //seter method which set the values
    public void setData(String courceName){
        this.cn = courceName;
    }//setter method ends here
    
    public String getData(){
        return this.cn;
    }//getData method ends here
    
    public void display(){
        System.out.println("Welcome to GradeBook!");
    }//display method without perameter
    
    public void display(String courceName){
        System.out.println("Welcome to GradeBook! "+courceName);
    }//display method with one perameter


}//GradeBooks Calss ends here
