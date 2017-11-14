
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loh
 */
public class assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String end = "NO";
        do {
            System.out.println("*****Welcome To******");
            System.out.println("Affiliate Restaurant");
            System.out.println("*********************");
            System.out.println("1.Track Order Remaining Time");
            System.out.println("2.EXIT");
            System.out.println("Enter the number you want:");
            String answer = input.nextLine();
            answer = answer.toUpperCase();
            if ("1".equals(answer)) {
                System.out.println("Your order will arrives within 20mins");
                System.out.println("Do you want continue:[YES] Or [NO]");
                end = input.nextLine();
                end = end.toUpperCase();
            } else {
                System.out.println("Thanks for visited our restaurant");
                System.out.println("*********************************");

                break;
            }
        } while ("YES".equals(end));
    }
}
