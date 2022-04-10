
import java.util.Scanner;

public class C01_CalculateTicketPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the distance you want to travel: ");
        int distance = scanner.nextInt();
        if (distance < 1 || distance > 20000) {
            System.err.println("You've entered a wrong value.");
            System.exit(-1);
        }
        System.out.println("Please write your age: ");
        int age = scanner.nextInt();
        if (age < 1 || age > 130) {
            System.err.println("You've entered a wrong value.");
            System.exit(-1);
        }
        System.out.println("Please write your ticket type: (1 => One Way Ticket , 2 => Round Ticket)");
        int ticketType = scanner.nextInt();
        if (!(ticketType == 1 || ticketType == 2)) {
            System.err.println("You've entered a wrong value.");
            System.exit(-1);
        }

        double pricePerKM = 0.10;
        double ticketPrice = distance * pricePerKM;
        double ageDiscount = 0;
        double roundTripDisc=0;


        if (age < 12) {
            ageDiscount = 0.5 * ticketPrice;
        } else if (age < 24) {
            ageDiscount = 0.1 * ticketPrice;
        } else if (age > 65) {
            ageDiscount = 0.3 * ticketPrice;
        }

        if (ticketType == 2) {
            roundTripDisc = (ticketPrice-ageDiscount) * 0.2;
            System.out.println("The plane ticket price : " +  (2*(ticketPrice-ageDiscount-roundTripDisc))  + " TL");
            return;
        }
        System.out.println("The plane ticket price : " + (int) (ticketPrice-ageDiscount) + " TL");

    }
}
