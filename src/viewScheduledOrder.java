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
public class viewScheduledOrder {

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
        order[0].setLocation("23-17, Pv15, Setapak");
        order[0].setShop("coco chicken");
        order[0].setDeliveryMan("1");
        order[1].setDeliveryTime("2");
        order[1].setFoodType("2");
        order[1].setLocation("10-10, Pv15, Setapak");
        order[1].setShop("LokLok pv128");
        order[1].setDeliveryMan("1");
        order[2].setDeliveryTime("7");
        order[2].setFoodType("3");
        order[2].setLocation("cincai");
        order[2].setShop("Big Hug");
        order[2].setDeliveryMan("2");

        boolean status = true;
        boolean condition = true;

        do {

            System.out.println("View Scheduled Order");
            System.out.println("---------------------------------------------");
            System.out.println("Which delivery man you would like to choose?");
            System.out.println("1. Hao Wen");
            System.out.println("2. John");

            System.out.print("Your selection is : ");

            String answer = scanner.nextLine();
            System.out.println("");
            System.out.println("");

            if ("1".equals(answer)) {
                int i = 0;
                System.out.println("Delivery for Hao Wen");
                System.out.println("--------------------------");
                do {
                    if (order[i].getDeliveryMan().equals("1")) {
                        System.out.println("Food Shop     : " + order[i].getShop());
                        System.out.println("Food Type     : " + cincai(order[i].getFoodType()));
                        System.out.println("Delivery Time : " + time(order[i].getDeliveryTime()));
                        System.out.println("Location      : " + order[i].getLocation());
                        System.out.println("-------------------------------------");
                        System.out.println("");
                    }
                    i++;
                } while (order[i] != null);
            } else if ("2".equals(answer)) {
                int i = 0;
                System.out.println("Delivery for John");
                System.out.println("--------------------------");
                do {
                    if (order[i].getDeliveryMan().equals("2")) {
                        System.out.println("Food Shop     : " + order[i].getShop());
                        System.out.println("Food Type     : " + cincai(order[i].getFoodType()));
                        System.out.println("Delivery Time : " + time(order[i].getDeliveryTime()));
                        System.out.println("Location      : " + order[i].getLocation());
                        System.out.println("-------------------------------------");
                        System.out.println("");
                    }
                    i++;
                } while (order[i] != null);
            }

            System.out.println("Do you want to restart the operation?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            System.out.print("Your selection is : ");
            String redo = scanner.nextLine();
            System.out.println("");
            System.out.println("");

            if (redo.equals("1")) {
                status = false;
            } else if (redo.equals("2")) {
                status = true;
            }

        } while (status == false);

    }

    static class Order {

        String deliveryTime;
        String foodType;
        String location;
        String shop;
        String deliveryMan;

        public Order() {
        }

        public Order(String deliveryTime, String foodType) {
            this.deliveryTime = deliveryTime;
            this.foodType = foodType;
        }

        public Order(String deliveryTime, String foodType, String location, String shop, String deliveryMan) {
            this.deliveryTime = deliveryTime;
            this.foodType = foodType;
            this.location = location;
            this.shop = shop;
            this.deliveryMan = deliveryMan;
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

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getShop() {
            return shop;
        }

        public void setShop(String shop) {
            this.shop = shop;
        }

        public String getDeliveryMan() {
            return deliveryMan;
        }

        public void setDeliveryMan(String deliveryMan) {
            this.deliveryMan = deliveryMan;
        }

    }

    public static String cincai(String i) {
        if (i.equals("1")) {
            return "1 Meat 2 Vegetable";
        } else if (i.equals("2")) {
            return "2 Meat 1 Vegetable";
        } else if (i.equals("3")) {
            return "2 Meat 1 Vegetable 1 Soup";
        }
        
        return "";
    }

    public static String time(String i) {

        if (i.equals("1")) {
            return "11am-12pm";
        } else if (i.equals("2")) {
            return "12pm-1pm";
        } else if (i.equals("3")) {
            return "1pm-2pm";
        } else if (i.equals("4")) {
            return "2pm-3pm";
        } else if (i.equals("5")) {
            return "5pm-6pm";
        } else if (i.equals("6")) {
            return "6pm-7pm";
        } else if (i.equals("7")) {
            return "7pm-8pm";
        }

        return "";
    }

}
