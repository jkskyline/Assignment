/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author User
 */
public class updateScheduledOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        Order[] order = new Order[10];
        order[0] = new Order();
        order[1] = new Order();
        order[2] = new Order();
        order[0].setDeliveryTime("1");
        order[0].setFoodType("1");
        order[1].setDeliveryTime("2");
        order[1].setFoodType("2");
        order[2].setDeliveryTime("7");
        order[2].setFoodType("3");

        boolean status = true;
        boolean condition = true;

        do {

            System.out.println("welcome to order in advance (Scheduled Order)");
            System.out.println("---------------------------------------------");
            System.out.println("Which function you would like to choose?");
            System.out.println("1. Create Order");
            System.out.println("2. Update Order");

            System.out.print("Your selection is : ");

            String answer = scanner.nextLine();

            if ("1".equals(answer)) {

            } else if ("2".equals(answer)) {
                int i = 0;

                System.out.println("");
                System.out.println("Which order you want to edit?");
                do {
                    if (order[i] != null) {
                        System.out.print((i + 1) + ". ");
                        if (order[i].deliveryTime.equals("1")) {
                            System.out.print("11am-12pm + ");
                            cincai(order[i].foodType);
                        } else if (order[i].deliveryTime.equals("2")) {
                            System.out.print("12am-1pm + ");
                            cincai(order[i].foodType);
                        } else if (order[i].deliveryTime.equals("3")) {
                            System.out.print("1pm-2pm + ");
                            cincai(order[i].foodType);
                        } else if (order[i].deliveryTime.equals("4")) {
                            System.out.print("2pm-3pm + ");
                            cincai(order[i].foodType);
                        } else if (order[i].deliveryTime.equals("5")) {
                            System.out.print("5pm-6pm + ");
                            cincai(order[i].foodType);
                        } else if (order[i].deliveryTime.equals("6")) {
                            System.out.print("6pm-7pm + ");
                            cincai(order[i].foodType);
                        } else if (order[i].deliveryTime.equals("7")) {
                            System.out.print("7pm-8pm + ");
                            cincai(order[i].foodType);
                        }

                    }
                    i++;
                    System.out.println("");
                } while (order[i] != null);

                do {
                    condition = true;
                    System.out.print("Your selection is : ");

                    String updateSelection = scanner.nextLine();

                    try {
                        int selected = Integer.parseInt(updateSelection);

                        if (order[selected-1] != null) {

                            System.out.println("What you wanna change?");
                            System.out.println("1. Time");
                            System.out.println("2. Food Type");

                            System.out.print("Your selection is : ");
                            String selectChange = scanner.nextLine();

                            if ("1".equals(selectChange)) {
                                System.out.println("What time you wanna change to?");
                                System.out.println("1. 11am-12pm");
                                System.out.println("2. 12pm-1pm");
                                System.out.println("3. 1pm-2pm");
                                System.out.println("4. 2pm-3pm");
                                System.out.println("5. 5pm-6pm");
                                System.out.println("6. 6pm-7pm");
                                System.out.println("7. 7pm-8pm");

                                System.out.print("Your selection is : ");
                                String timeChange = scanner.nextLine();

                                order[selected-1].setDeliveryTime(timeChange);
                                condition = true;

                            } else if ("2".equals(selectChange)) {
                                System.out.println("Which food type you wanna change to?");
                                System.out.println("1. 1 Meat 2 Vegetable");
                                System.out.println("2. 2 Meat 1 Vegetable");
                                System.out.println("3. 2 Meat 1 Vegetable 1 Soup");

                                System.out.print("Your selection is : ");
                                String typeChange = scanner.nextLine();

                                order[selected-1].setFoodType(typeChange);
                                condition = true;
                            }

                        } else {
                            System.out.println("please select the value that is shown");
                            condition = false;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid selection");
                        condition = false;
                    }

                } while (condition == false);
            }

            System.out.println("Do you want to restart the operation?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            
            System.out.print("Your selection is : ");
            String redo = scanner.nextLine();
            
            if(redo.equals("1"))
            {
                status = false;
            }
            else if(redo.equals("2"))
            {
                status = true;
            }

        } while (status == false);

    }

    static class Order {

        String deliveryTime;
        String foodType;

        public Order() {
        }

        public Order(String deliveryTime, String foodType) {
            this.deliveryTime = deliveryTime;
            this.foodType = foodType;
        }

        public String getDeliveryTime() {
            return deliveryTime;
        }

        public void setDeliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
        }

        public String getFoodType() {
            return foodType;
        }

        public void setFoodType(String foodType) {
            this.foodType = foodType;
        }

    }

    public static void cincai(String i) {
        if (i.equals("1")) {
            System.out.print(" 1 Meat 2 Vegetable");
        } else if (i.equals("2")) {
            System.out.print(" 2 Meat 1 Vegetable");
        } else if (i.equals("3")) {
            System.out.print(" 2 Meat 1 Vegetable 1 Soup");
        }
    }
}
