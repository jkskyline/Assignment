
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class createScheduledOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean selection = false;
        boolean status = true;

        do {
            System.out.println("welcome to order in advance (Scheduled Order)");
            System.out.println("---------------------------------------------");
            System.out.println("Which time you wish to order?");
            System.out.println("1. 11am-12pm");
            System.out.println("2. 12pm-1pm");
            System.out.println("3. 1pm-2pm");
            System.out.println("4. 2pm-3pm");
            System.out.println("5. 5pm-6pm");
            System.out.println("6. 6pm-7pm");
            System.out.println("7. 7pm-8pm");

            do {
                System.out.print("Your selection is : ");

                String answer = scanner.nextLine();

                if (answer == "1") {
                    System.out.println("You have selected 11am-12pm.");
                } else if (answer == "2") {
                    System.out.println("You have selected 12pm-1pm.");
                } else if (answer == "3") {
                    System.out.println("You have selected 1pm-2pm.");
                } else if (answer == "4") {
                    System.out.println("You have selected 2pm-3pm.");
                } else if (answer == "5") {
                    System.out.println("You have selected 5pm-6pm.");
                } else if (answer == "6") {
                    System.out.println("You have selected 6pm-7pm.");
                } else if (answer == "7") {
                    System.out.println("You have selected 7pm-8pm.");
                } else {
                    System.out.println("Your selection are invalid.");
                    System.out.println("Please try again.");
                    status = false;
                }
            } while (status == false);
        } while (selection == true);

    }
}
