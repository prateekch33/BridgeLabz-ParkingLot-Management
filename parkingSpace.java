package Day6;

import java.util.Scanner;

public class parkingSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of Fee Per Hour: ");
        int feePerHour = in.nextInt();
        Attended ob = new Attended(feePerHour);
        int choice;
        do {
            System.out.println("Enter the choice of the task:");
            System.out.println("1. Entry");
            System.out.println("2. Exit");
            System.out.println("3. End the Program");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    ob.addVehicle();
                    break;
                case 2:
                    ob.exitVehicle();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        } while (choice != 3);
        System.out.println("Thank you");
        in.close();

    }
}
