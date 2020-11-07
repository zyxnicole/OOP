package exercise3;

import exercise2.Rectangle;
import exercise2.Triangle;

import java.io.*;

/**
 * Program: INFO5100
 * Description: Serialization of exercise 2
 * CreatedBy: Nicole_Z
 * CreatDate: 11/07/2020
 **/

public class SerializeRectangle {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (true) { //Make it to true to serialize an object
            Rectangle rectangle = new Rectangle(3,4);
            FileOutputStream fileOutputStream =
                    new FileOutputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeRectangle.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(rectangle);
            objectOutput.close();
            fileOutputStream.close();
            System.out.println(
                    "Serialized data is saved in /Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeRectangle.ser");
        }
        if (true) { //Make it to true to deserialize an object

            Rectangle deRectangle = null;
            FileInputStream fileInputStream =
                    new FileInputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeRectangle.ser");
            ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
            deRectangle = (Rectangle) objectInput.readObject();
            objectInput.close();
            fileInputStream.close();
            System.out.println("Deserializing: " + deRectangle.toString());
            System.out.println("Perimeter = " + deRectangle.calculatePerimeter());
            System.out.printf("Area = %.2f \n", deRectangle.calculateArea());
        }
    }
}
