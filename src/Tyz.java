/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        
        String username, password, itemname, price;
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
               System.out.println("What action would you like to do?");
               System.out.println("1.Add new item");
               System.out.println("2.EXIT");
               String answer2 = input.nextLine();
               answer2=answer2.toUpperCase();
                if ("1".equals(answer2)){
                     System.out.println("Enter your item name:");
                     itemname = input.nextLine();
                     System.out.println("Enter your item price:");
                     price = input.nextLine();
                     if(itemname != null || price != null){
                         System.out.println("*********************");
                         System.out.println("Added successfully");
                     }
                     
                }
                else{
           System.out.println("Thanks for visited our restaurant");
           System.out.println("*********************************");
           
          
       }
                                
           }
        
       }
       else{
           System.out.println("Thanks for visited our restaurant");
           System.out.println("*********************************");
           
          
       }
      
    }
    
}
