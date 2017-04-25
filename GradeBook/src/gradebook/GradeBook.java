/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.util.Scanner;

/**
 *
 * @author muhammadsaim
 */
public class GradeBook{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
        *
        * creating all objects here 
        *
        */
        //creating scanner object
        Scanner input = new Scanner(System.in);
        //making object of GradesBooks
        GradeBooks obj = new GradeBooks("Computer Sciences");
        
        
        //variables
        //String courseName;
        
        
        //Getting input form the user
        //System.out.println("Enter Course Name: ");
        //courseName = input.nextLine();
        
        
        //Calling method
        //obj.setData(courseName);
        String name = obj.getData();
        System.out.println(name);
//        obj.display();
       
        
    }//main method ends here
    
}//class ends here
