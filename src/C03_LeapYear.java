import java.util.Scanner;


public class C03_LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.println("This is a leap year.");
            } else {
                System.err.println("This is NOT a leap year.");
            }
        } else {
            System.err.println("This is NOT a leap year.");
        }

    }
}

