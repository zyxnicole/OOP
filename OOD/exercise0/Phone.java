package exercise0;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class Phone {
    int volume;
    int brightness;
    String brand;
    String phoneStyle;
    String color;
    int internalMemory;
    double screenSize;
    boolean touchScreen;

    Phone(String object) {
        System.out.println("\nThe constructor created for: " + object);
    }

    void setVolume(int volume) {
        if (volume <= 0) {
            System.out.println("This is the minimum volume.");
        } else if (volume >=10) {
            System.out.println("This is the maximum volume.");
        } else {
            this.volume = volume;
            System.out.println("The volume is: " + volume);
        }
    }

    void setBrightness(int brightness) {
        if (brightness <= 0) {
            System.out.println("This is the minimum brightness.");
        } else if (brightness >=20) {
            System.out.println("This is the maximum brightness.");
        } else {
            this.brightness = brightness;
            System.out.println("The volume is: " + brightness);
        }
    }

    void setInformation() {
        brand = "Apple";
        phoneStyle = "Smart phone";
        color = "Space Gray";
        internalMemory = 256;
        screenSize = 5.8;
        touchScreen = true;
    }

    void getInformation() {
        System.out.println("Detail information: ");
        System.out.println("Brand: " + brand);
        System.out.println("Phone Style: " + phoneStyle);
        System.out.println("Color: " + color);
        System.out.println("Internal Memory: " + internalMemory + " gigabytes");
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Touch Screen: " + touchScreen);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("phone1");
        phone1.setVolume(5);

        Phone phone2 = new Phone("phone2");
        phone2.setBrightness(-1);

        Phone phone3 = new Phone("phone3");
        phone3.setInformation();
        phone3.getInformation();
    }
}
