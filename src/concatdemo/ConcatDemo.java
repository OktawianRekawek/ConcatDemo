/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatdemo;

/**
 *
 * @author Oktawian
 */
public class ConcatDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String firstString = "This is ";
        String secondString = "a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
    
}
