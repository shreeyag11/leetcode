package easy;

public class DesignParkingSystem {

    int[] parkingSpace;

    public ParkingSystem(int big, int medium, int small) {
            parkingSpace = new int[4];
            parkingSpace[1] = big;
            parkingSpace[2] = medium;
            parkingSpace[3] = small;
        }

    public boolean addCar(int carType) {
        if (parkingSpace[carType] == 0)
            return false;
        else {
            parkingSpace[carType]--;
            return true;
        }
    }

    /**
     * Your ParkingSystem object will be instantiated and called as such:
     * ParkingSystem obj = new ParkingSystem(big, medium, small); boolean param_1 =
     * obj.addCar(carType);
     */
}
