package exercise0;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 10/10/2020
 **/

public class AppleWatch {

    int screenSize;
    String productName;
    String operationSystem;
    Boolean waterResistant;
    String productType;
    int usageTime;
    String color;
    String displayType;
    double productWeight;
    String caseShape;

    AppleWatch(String Object) {
        System.out.println("\nConstructor was created for: " + Object);
    }

    void displayTime() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(date));
    }

    void showMessage() {
        System.out.println("This is the message.");
    }

    void getDetails() {
        screenSize = 40;
        productName = "Apple Watch Series 6";
        operationSystem = "Apple iOS";
        waterResistant = true;
        productType = "Smart watch";
        usageTime = 18;
        color = "Gold";
        displayType = "Retina Display";
        productWeight = 1.08;
        caseShape = "Rectangular";
    }

    public static void main(String[] args) {
        AppleWatch appleWatch1 = new AppleWatch("appleWatch1");
        appleWatch1.displayTime();

        AppleWatch appleWatch2 = new AppleWatch("appleWatch2");
        appleWatch2.showMessage();

        AppleWatch appleWatch3 = new AppleWatch("appleWatch3");
        appleWatch3.getDetails();
        System.out.println("Details of the apple watch: ");
        System.out.println("Screen Size: " + appleWatch3.screenSize + "millimeters");
        System.out.println("Product Name: " + appleWatch3.productName);
        System.out.println("Operation System: " + appleWatch3.operationSystem);
        System.out.println("Water Resistant: " + appleWatch3.waterResistant);
        System.out.println("Product Type: " + appleWatch3.productType);
        System.out.println("Usage Time: " + appleWatch3.usageTime + "hours");
        System.out.println("Color: " + appleWatch3.color);
        System.out.println("Display Type: " + appleWatch3.displayType);
        System.out.println("Product Weight: " + appleWatch3.productWeight + "ounces");
        System.out.println("Case Shape: " + appleWatch3.caseShape);

    }


}
