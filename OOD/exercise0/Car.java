package exercise0;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class Car {
    boolean trunkStatus;
    String brand;
    String outsideColor;
    String insideColor;
    String type;
    String driveType;
    boolean includeCarPlay;
    boolean seatHeating;


    Car(String Object) {
        System.out.println("\nConstructor was created for: " + Object);
    }

    void openTrunk() {
        trunkStatus = true; //open
    }

    void closeTrunk() {
        trunkStatus = false;
    }

    String checkTrunkStatus() {
        if (trunkStatus) {
            return "The trunk is opened.";
        }
        return "The trunk is closed";
    }

    void setCarDetail(){
        brand = "Jeep";
        outsideColor = "Silver Gray";
        insideColor = " Black";
        type = "SUV";
        driveType = "AWD";
        includeCarPlay = true;
        seatHeating = true;
    }

    void getCarDetail() {
        System.out.println("Details of The Car: ");
        System.out.println("Brand: " + brand);
        System.out.println("Outside Color: " + outsideColor);
        System.out.println("Inside Color: " + insideColor);
        System.out.println("Type: " + type);
        System.out.println("Drive Type: " + driveType);
        System.out.println("Including CarPlay System: " + includeCarPlay);
        System.out.println("Seat Heating: " + seatHeating);
    }

    public static void main(String[] args) {
        Car car1 = new Car("car1");
        car1.openTrunk();
        System.out.println(car1.checkTrunkStatus());

        Car car2 = new Car("car2");
        System.out.println(car2.checkTrunkStatus());

        Car car3 = new Car("car3");
        car3.setCarDetail();
        car3.getCarDetail();
    }
}
