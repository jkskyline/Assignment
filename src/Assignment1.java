/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Loh
 */
public class Assignment1 {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      String staffID = "7723d";
       String end="NO";
       String clock="Clock In";
       Calendar cal = Calendar.getInstance(); 
       cal.getTime(); 
       SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
       
       do{
        System.out.println("*********Welcome To**********");
        System.out.println("Fastest Deliveryman Sdn. Bhd.");
        System.out.println("*****************************");
        System.out.println("1.XYZ Restaurant");
        System.out.println("2.TARUC Restaurant");
        System.out.println("2.EXIT");
        System.out.println("Enter the number you want:");
        String answer = input.nextLine();
        answer=answer.toUpperCase();
       if ("1".equals(answer)||"2".equals(answer)){
           
           System.out.println("Please Enter Your Staff ID :");
           String orderID=input.nextLine();
           if(orderID.isEmpty()){
               System.out.println("Invalid Input");
            System.out.println("Do you want continue:[YES] Or [NO]");
           end=input.nextLine();
           end=end.toUpperCase();
           }
           else{
           System.out.println("Welcome "+orderID);
           System.out.println("1.Clock In");
           System.out.println("2.Clock Out");
           System.out.println("3.Exit");
           String check1 = input.nextLine();
           if("1".equals(check1)){
           System.out.println("Successfully clock in at " +sdf.format(cal.getTime())+".Soon the system will assign the new job for you!!");
           System.out.println("Do you want continue:[YES] Or [NO]");
           end=input.nextLine();
           end=end.toUpperCase();
               
           }
           else if("2".equals(check1)){
           System.out.println("Successfully clock out at "+sdf.format(cal.getTime())+"!!Good Bye!!");
           System.out.println("Do you want continue:[YES] Or [NO]");
           end=input.nextLine();
           end=end.toUpperCase();
           }
           else{
               end="NO";
               end=input.nextLine();
           end=end.toUpperCase();
           }
           
           }
       }
       else if(answer.isEmpty()){
           System.out.println("Invalid Input");
           System.out.println("Do you want continue:[YES] Or [NO]");
           end=input.nextLine();
           end=end.toUpperCase();
       }
       else{
           System.out.println("Thanks for visited");
           System.out.println("******************");
           
          break;
       }
       }while("YES".equals(end));
    }
    
}
