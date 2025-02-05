
public class Car {
    public static boolean handicapped = true;

    public String make;
    public String color;
    
    public Car(){
        make = "toyota";
        color = "pink";
        handicapped = true;
    }
    public Car(String make, String color, boolean handicapped){
        this.make = make;
        this.color = color;
        this.handicapped = handicapped;
    }


    public String toString(){
        return "Make: " + make + "\nColor: " + color + "\nHandicapped: " + handicapped;
    }
}