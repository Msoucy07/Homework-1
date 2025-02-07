public class ParkingLot {
    public ParkingSpot handicapped = new ParkingSpot(true);
    public ParkingSpot not_handicapped = new ParkingSpot(false);
    public static ParkingSpot lot[];


    public ParkingLot(){
        lot = new ParkingSpot[6];
        lot[0] = handicapped;
        lot[1] = handicapped;
        lot[2] = not_handicapped;
        lot[3] = not_handicapped;
        lot[4] = not_handicapped;
        lot[5] = not_handicapped;
        lot[6] = not_handicapped;
        lot[7] = not_handicapped;

    }
    public static void main(String[] args) {
        System.out.println(lot[1]);
    }

}
