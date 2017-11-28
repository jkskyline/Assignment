

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
public class Tyz2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
        System.out.println("*****Welcome To******");
        System.out.println("Affiliate Restaurant");
        System.out.println("*********************");
        System.out.println("What action would you like to do?");
        System.out.println("1.Register as affiliates");
        System.out.println("2.Log In");
        System.out.println("3.Reset Account Password");
        System.out.println("4.EXIT");
        String answer = input.nextLine();
        answer=answer.toUpperCase();
        
        String username, password, password2;
       if ("3".equals(answer)){
           System.out.println("Reset account password");
           System.out.println("*********************");
           System.out.println("Enter your old account username:");
           username = input.nextLine();
           System.out.println("Enter your new passowrd for the account:");
           password = input.nextLine();
           System.out.println("Enter one more time of your new passowrd:");
           password2 = input.nextLine();
           if( password == null ? password2 == null : password.equals(password2) ){
               System.out.println("*********************");
               System.out.println("You have successfully change the account password!");
               System.out.println("Please log in and try! =)");
           }
           
           
       }
       else{
           System.out.println("Thanks for visited our restaurant");
           System.out.println("*********************************");
           
          
       }
      
    }
}
