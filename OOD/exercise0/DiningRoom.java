package exercise0;

import java.util.List;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class DiningRoom {
    int numberOfTable;
    String dinners;
    String light;
    String tableMaterial;
    int numberOfCup;
    int numbersOfChair;
    double area;
    double height;


    DiningRoom(String object) {
        System.out.println("\nThe constructor is created for " + object);
    }

    void getDiningRoomDetail() {
        numberOfTable = 1;
        tableMaterial = "Solid Wood";
        numberOfCup = 4;
        numbersOfChair = 4;
        area = 107.64;
        height = 9.00;
    }

    void setupDinner(int numberOfGuests) {
        if (numberOfGuests >= 6) {
            dinners = "This is a big family dinner";
        }
        if (numberOfGuests < 6) {
            dinners = "This is a regular dinner";
        }
    }

    String openLight() {
        light = "Light is open";
        return light;
    }

    public class DiningChairs {
        int numbersOfChairs;
        String material;

        DiningChairs(String object) {
            System.out.println("\nThe Constructor is created for " + object);
        }

        public void chairsDetail() {
            numbersOfChairs = 6;
            material = "metal";
        }
    }


    public static void main(String[] args) {
        DiningRoom DR1 = new DiningRoom("DR1");
        System.out.println(DR1.openLight());

        DiningRoom DR2 = new DiningRoom("DR2");
        System.out.println("Dining Table Details: ");
        DR2.getDiningRoomDetail();
        System.out.println("Number of legs: " + DR2.numberOfTable);
        System.out.println("Table material: " + DR2.tableMaterial);
        System.out.println("Numbers of cups: " + DR2.numberOfCup);
        System.out.println("Numbers of chairs " + DR2.numbersOfChair);
        System.out.println("Area: " + DR2.area + "Sqft");
        System.out.println("Height: " + DR2.height + "Foot");


        DiningRoom.DiningChairs DC = DR2.new DiningChairs("DC");
        DC.chairsDetail();
        System.out.println("Number of chairs: " + DC.numbersOfChairs);
        System.out.println("Material: " + DC.material);

        DiningRoom DR3 = new DiningRoom("DR3");
        DR3.setupDinner(6);
        System.out.println(DR3.dinners);
    }
}
