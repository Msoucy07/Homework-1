public class ParkingSpot {

    Car myCar = new Car("Toyota", "Black", true);  
    public static boolean is_handicapped;

    public ParkingSpot(){
        is_handicapped = true;
    }
    public ParkingSpot(boolean is_handicapped){
        this.is_handicapped = is_handicapped;
    }

    public String toString(){
        return myCar + "\nHandicapped Spot: " + is_handicapped;
    }
}
