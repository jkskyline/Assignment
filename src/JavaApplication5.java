import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gl62
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~WELCOME~~~~~~~~~~ ");
        System.out.println("A :MAMAK ABC  B:RESTAURANT CDE  C:RESTAURANT FGH");
        System.out.println("Choose a restaurant that you want to order : ");
        String choose = sc.nextLine();
        System.out.println("A: MAMAK ABC");
        System.out.println("Choose a food that you want: ");
        System.out.println("A :Nasi Lemak  B:Maggi Goreng  C:Nasi Kandar");
        String choose1 = sc.nextLine();
        System.out.println("How many you want to order: ");
        String quantity = sc.nextLine();
        System.out.println("You have choose: ");
        System.out.println("A :Nasi Lemak = 1 ");
    }
}