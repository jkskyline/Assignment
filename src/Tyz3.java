/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyz;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tyz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
        System.out.println("*****Welcome To******");
        System.out.println("Affiliate Restaurant");
        System.out.println("*********************");
        System.out.println("What action would you like to do?");
        System.out.println("1.Register as affiliates");
        System.out.println("2.EXIT");
        String answer = input.nextLine();
        answer=answer.toUpperCase();
        
        String username, password;
       if ("1".equals(answer)){
           System.out.println("Creating account");
           System.out.println("*********************");
           System.out.println("Enter your username for the account:");
           username = input.nextLine();
           System.out.println("Enter your passowrd for the account:");
           password = input.nextLine();
           if(username != null || password != null){
               System.out.println("*********************");
               System.out.println("You have successfully create the account!");
           }
           
           
       }
       else{
           System.out.println("Thanks for visited our restaurant");
           System.out.println("*********************************");
           
          
       }
      
    }
    
}
