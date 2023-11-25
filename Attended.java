package Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Attended {
    int feePerHour;
    Scanner in = new Scanner(System.in);
    ArrayList<ParkingLot> a = new ArrayList<ParkingLot>();

    public Attended(int feePerHour) {
        this.feePerHour = feePerHour;
    }

    public void addVehicle() {
        ParkingLot ob = new ParkingLot();
        System.out.print("Enter Parking Lot Number: ");
        int parkingLotNumber = in.nextInt();
        System.out.print("Enter the Vehicle Number: ");
        int vehicleNumber = in.nextInt();
        ob.setParkingSpaceNumber(parkingLotNumber, vehicleNumber);
        a.add(ob);
        System.out.println("Parking Space Alloted");
    }

    public void exitVehicle() {
        System.out.print("Enter Parking Space Number: ");
        int spaceNumber = in.nextInt();
        int totalFee = 0;
        for (ParkingLot i : a) {
            if (i.getParkingSpaceNumber() == spaceNumber) {
                System.out.print("Enter no of Hours vehicle is parked: ");
                int hr = in.nextInt();
                totalFee = hr * this.feePerHour;
                System.out.printf("Total Parking Fee: %d\n", totalFee);
                a.remove(i);
                System.out.println("Parking lot cleared");
                break;
            }

        }
    }
}
