package exercise0;

/**
 * Program: INFO5100
 * Description: Exercise_0
 * CreatedBy: Nicole_Z
 * CreatDate: 10/03/2020
 **/

public class Laptop {
    int Brightness;
    String Brand;
    double ScreenSize;
    int BatteryLife;
    String DisplayType;
    String StoryType;
    String Color;
    boolean TouchScreen;


    Laptop(String object) {
        System.out.println("\nThe constructor created for: " + object);
    }

    int increaseBrightness() {
        Brightness++;
        if (Brightness > 10) {
            Brightness = 10;
            System.out.println("This is the maximum brightness");
        }
        return Brightness;

    }

    int reduceBrightness() {
        Brightness--;
        if (Brightness < 1) {
            Brightness = 1;
            System.out.println("This is the minimum brightness");
        }
        return Brightness;
    }

    int getBrightness() {
        return Brightness;
    }

    void getDetails() {
        this.Brand = "Apple";
        this.ScreenSize = 13.3;
        this.BatteryLife = 10;
        this.DisplayType = "LED";
        this.StoryType = "SSD";
        this.Color = "Gray";
        this.TouchScreen = true;

        System.out.println("Brand: " + Brand);
        System.out.println("ScreenSize: " + ScreenSize + " inches");
        System.out.println("BatteryLife: " + BatteryLife + " hours");
        System.out.println("DisplayType: " + DisplayType);
        System.out.println("StoryType: " + StoryType);
        System.out.println("Color: " + Color);
        System.out.println("TouchScreen: " + TouchScreen);
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("laptop1");
        laptop1.increaseBrightness();
        laptop1.increaseBrightness();
        laptop1.increaseBrightness();
        System.out.println("The brightness of the laptop1 is: " + laptop1.getBrightness());


        Laptop laptop2 = new Laptop("laptop2");
        laptop2.reduceBrightness();
        System.out.println("The brightness of the laptop2 is: " + laptop2.getBrightness());

        Laptop laptop3 = new Laptop("laptop3");
        System.out.println("Laptop Details: ");
        laptop3.getDetails();


    }
}
