package exercise0;

import java.awt.desktop.SystemEventListener;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class Speaker {
    int volume;
    String brand;
    String color;
    int batteryLife;
    boolean waterResistant;
    boolean wireless;
    boolean rechargeable;
    double productWeight;

    public Speaker(String object) {
        System.out.println("\nA constructor was created for " + object);
    }

    void volumeUp() {
        volume++;

        if (volume > 10) {
            volume = 10;
            System.out.println("This is the maximum volume");
        }
    }

    void volumeDown(){
        volume--;
        if (volume < 1) {
            volume = 0;
            System.out.println("This is the minimum volume");
        }
    }


    int getVolume() {
        return volume;
    }

    void getSpecification() {
        this.brand = "Marshall";
        this.color = "Black";
        this.batteryLife = 20;
        this.productWeight = 3.04;
        this.waterResistant = true;
        this.wireless = true;
        this.rechargeable = true;
    }

    public static void main(String[] args) {
        Speaker speaker1 = new Speaker("speaker");
        System.out.println("The specifications of speaker1:");
        speaker1.getSpecification();
        System.out.println("Brand: " + speaker1.brand);
        System.out.println("Color: " + speaker1.color);
        System.out.println("BatteryLife: " + speaker1.batteryLife + " hours");
        System.out.println("Weight: " + speaker1.productWeight + " pounds");
        System.out.println("WaterResistant: " + speaker1.waterResistant);
        System.out.println("Wireless: " + speaker1.wireless);
        System.out.println("Rechargeable: " + speaker1.rechargeable);


        Speaker speaker2 = new Speaker("speaker2");
        speaker2.volumeUp();
        speaker2.volumeUp();
        System.out.println("The volume of the speaker2 is: " + speaker2.getVolume());

        Speaker speaker3 = new Speaker("speaker3");
        speaker3.volumeDown();
        System.out.println("The volume of the speaker3 is: " + speaker3.getVolume());
    }


}
