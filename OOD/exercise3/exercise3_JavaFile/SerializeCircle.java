package exercise3;

import exercise2.Circle;
import exercise2.Rectangle;

import java.io.*;

/**
 * Program: INFO5100
 * Description: Serialization of exercise 2
 * CreatedBy: Nicole_Z
 * CreatDate: 11/07/2020
 **/

public class SerializeCircle {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (true) { //Make it to true to serialize an object
            Circle circle = new Circle(3);
            FileOutputStream fileOutputStream =
                    new FileOutputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeCircle.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(circle);
            objectOutput.close();
            fileOutputStream.close();
            System.out.println(
                    "Serialized data is saved in /Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeCircle.ser");
        }
        if (true) { //Make it to true to deserialize an object

            Circle deCircle = null;
            FileInputStream fileInputStream =
                    new FileInputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeCircle.ser");
            ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
            deCircle = (Circle) objectInput.readObject();
            objectInput.close();
            fileInputStream.close();
            System.out.println("Deserializing: " + deCircle.toString());
            System.out.println("Perimeter = " + deCircle.calculatePerimeter());
            System.out.printf("Area = %.2f \n", deCircle.calculateArea());
        }
    }
}
