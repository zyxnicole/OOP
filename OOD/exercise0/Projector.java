package exercise0;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class Projector {
    boolean isOpen;
    int brightness;
    String brand;
    String aspectRatio;
    int lambLife;
    boolean threeDTechnology;
    String contrastRatio;
    String color;


    Projector(String Object) {
        System.out.println("\nThe constructor is created for " + Object);
    }

    void openProjector() {
        isOpen = true;
    }

    void closeProjector() {
        isOpen = false;
    }

    void checkProjectorStatus() {
        if(isOpen) {
            System.out.println("The projector is opened.");
        } else System.out.println("The projector is closed.");
    }
    void projectorDetails() {
        brightness = 4200;
        brand = "Optoma";
        contrastRatio = "30,0000 : 1";
        color = "White";
        aspectRatio = "16 : 9";
        threeDTechnology = true;
        lambLife = 30000;
    }

    public static void main(String[] args) {
        Projector pt1 = new Projector("pt1");
        pt1.openProjector();
        pt1.checkProjectorStatus();

        Projector pt2 = new Projector("pt2");
        pt2.checkProjectorStatus();

        Projector pt3 = new Projector("pt3");
        System.out.println("Details of Projector: ");
        System.out.println("Brand: " + pt3.brand);
        System.out.println("Brightness: " + pt3.brightness);
        System.out.println("Contrast ratio: " + pt3.contrastRatio);
        System.out.println("Color: " + pt3.color);
        System.out.println("Aspect ratio: " + pt3.aspectRatio);
        System.out.println("Includes 3D Technology: " + pt3.threeDTechnology);
        System.out.println("Lamb life: " + pt3.lambLife);
    }

}
