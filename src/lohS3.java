
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class lohS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String staffID = "7723d";
        String managerID = "m1234";
        String end = "NO", endManager = "NO", endStaff = "NO";
        String StaffClock = "Clock Out", ManagerClock = "Clock Out";
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        System.out.println("*********Welcome To**********");
        System.out.println("Fastest Deliveryman Sdn. Bhd.");
        System.out.println("*****************************");
        System.out.println("1.XYZ Restaurant");
        System.out.println("2.TARUC Restaurant");
        System.out.println("3.EXIT");
        System.out.println("Enter the number that you want to continue the action:");
        String answer = input.nextLine();
        answer = answer.toUpperCase();
        do {
            if ("1".equals(answer) || "2".equals(answer)) {
                System.out.println("Welcome");
                System.out.println("=======");
                System.out.println("1.Login as Manager");
                System.out.println("2.Login as Staff");
                System.out.println("3.Exit");
                System.out.println("Enter the number that you want to continue the action :");
                answer = input.nextLine();
                answer = answer.toUpperCase();
                if ("1".equals(answer)) {
                    System.out.println("Please Enter Your Manager ID :");
                    String managerId = input.nextLine();
                    if (managerID.isEmpty()) {
                        System.out.println("Invalid Input");
                        System.out.println("Do you want continue:[YES] Or [NO]");
                        end = input.nextLine();
                        end = end.toUpperCase();
                    } else {

                        System.out.println("Welcome manager");
                        System.out.println("===============");
                        System.out.println("1.Clock In");
                        System.out.println("2.Clock Out");
                        System.out.println("3.Check the staff status");
                        System.out.println("4.Exit");
                        answer = input.nextLine();
                        answer = answer.toUpperCase();
                        switch (answer) {
                            case "1":
                                if ("Clock Out".equals(ManagerClock)) {
                                    System.out.println("Successfully clock in at " + sdf.format(cal.getTime()));
                                    ManagerClock = "Clock In";
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();
                                    break;
                                } else {
                                    System.out.println("Sorry, You already clock in the system.");
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();
                                    break;
                                }
                            case "2":
                                if (!"Clock Out".equals(ManagerClock)) {
                                    System.out.println("Successfully clock out at " + sdf.format(cal.getTime()) + "!!Good Bye!!");
                                    ManagerClock = "Clock Out";
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();
                                    break;
                                } else {
                                    System.out.println("Sorry, You already clock out the system.");
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();
                                    break;
                                }
                            case "3":
                                System.out.println("Please enter the Staff ID to check their status:");
                                String checkStatus = input.nextLine();
                                if ("Clock Out".equals(StaffClock)) {
                                    System.out.println("The staff already clock out the system.");
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();
                                   
                                    break;
                                } else {
                                    System.out.println("The staff already clock in the system.");
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();
                                    
                                    break;
                                }

                            case "4":
                                System.out.println("Thanks for visited");
                                System.out.println("******************");
                                end = "NO";

                                break;

                        }

                    }
                } else if ("2".equals(answer)) {
                    System.out.println("Please Enter Your Staff ID :");
                    String orderID = input.nextLine();
                    if (orderID.isEmpty()) {
                        System.out.println("Invalid Input");
                        System.out.println("Do you want continue:[YES] Or [NO]");
                        end = input.nextLine();
                        end = end.toUpperCase();
                    } else {

                        System.out.println("Welcome " + orderID);
                        System.out.println("1.Clock In");
                        System.out.println("2.Clock Out");
                        System.out.println("3.Exit");
                        System.out.println("Enter the number that you want to continue the action:");
                        String Staffanswer = input.nextLine();
                        Staffanswer = Staffanswer.toUpperCase();
                        switch (Staffanswer) {
                            case "1":
                                if ("Clock Out".equals(StaffClock)) {
                                    System.out.println("Successfully clock in at " + sdf.format(cal.getTime()) + "Soon the system will assign the job for you.");
                                    StaffClock = "Clock In";
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();

                                    break;
                                } else {
                                    System.out.println("Sorry, You already clock in the system.");
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();

                                    break;
                                }
                            case "2":
                                if (!"Clock Out".equals(StaffClock)) {
                                    System.out.println("Successfully clock out at " + sdf.format(cal.getTime()) + "!!Good Bye!!");
                                    StaffClock = "Clock Out";
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();

                                    break;
                                } else {
                                    System.out.println("Sorry, You already clock out the system.");
                                    System.out.println("Do you want continue:[YES] Or [NO]");
                                    end = input.nextLine();
                                    end = end.toUpperCase();

                                    break;
                                }
                            case "3":
                                System.out.println("Thanks for visited");
                                System.out.println("******************");

                                end = "NO";
                                break;
                        }

                    }
                }
            } else {
                System.out.println("Thanks for visited");
                System.out.println("******************");
                end = "NO";
            }

        } while (end.equals("YES"));
    }
}
