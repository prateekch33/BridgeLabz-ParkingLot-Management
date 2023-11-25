package Day6;

import java.util.Scanner;
// import Day6.Vehicle ;

public class ParkingLot {
    Vehicle ob = new Vehicle();
    private int parkingSpaceNumber;
    private boolean occupied;
    Scanner in = new Scanner(System.in);

    public void setParkingSpaceNumber(int n, int vehicleNumber) {
        this.occupied = true;
        this.parkingSpaceNumber = n;
        ob.setVehicleNumber(vehicleNumber);
    }

    public int getParkingSpaceNumber() {
        return parkingSpaceNumber;
    }

    public void setOccupied(boolean x) {
        this.occupied = x;
    }

    public boolean getOccupied() {
        return occupied;
    }
}
