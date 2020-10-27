package exercise0;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class Printer {
    boolean power;
    int paperNumbers;
    boolean outOfPaper = true;
    String brand;
    String networking;
    String color;
    int trayCapacity = 500;
    boolean touchScreen;




    Printer(String Object) {
        System.out.println("\nConstructor was created for: " + Object);
    }

    void setPowerOn() {
        power = true;
    }

    void checkPowerStatus() {
        if (power) {
            System.out.println("The light is on.");
        } else System.out.println("The light is off");
    }
    void fillPaper(int number) {
        if (number > trayCapacity) {
            System.out.println("Exceeding capacity limit");
        } else {
            paperNumbers = number;
            outOfPaper = false;
            System.out.println("Number of papers: " + number);
        }
    }
    void print(int numbers) {
        if (outOfPaper) {
            System.out.println("Out of paper");
        } else {
            paperNumbers -= numbers;
            if (paperNumbers <= 0) {
                System.out.println("Out of paper. \nThe number of Printed pages is: " + (numbers + paperNumbers));
            } else
                System.out.println("Printing completed. The number of paper is: " + numbers);
        }
    }
    void specifications() {
        brand = "HP";
        networking = "wireless";
        color = "gray";
        touchScreen = true;
    }

    public static void main(String[] args) {
        Printer printer1 = new Printer("printer1");
        printer1.setPowerOn();
        printer1.checkPowerStatus();

        Printer printer2 = new Printer("printer2");
        printer2.fillPaper(100);
        printer2.print(101);

        Printer printer3 = new Printer("printer3");
        printer3.specifications();
        System.out.println("Brand: " + printer3.brand);
        System.out.println("Networking: " + printer3.networking);
        System.out.println("Color: " + printer3.color);
        System.out.println("Touch Screen: " + printer3.touchScreen);
    }
}
