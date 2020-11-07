package exercise3;

import exercise2.Shape;
import exercise2.Triangle;

import java.io.*;

/**
 * Program: INFO5100
 * Description: Serialization of exercise 2
 * CreatedBy: Nicole_Z
 * CreatDate: 11/07/2020
 **/

public class SerializeTriangle {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (true) { //Make it to true to serialize an object
            Triangle triangle = new Triangle(3,4,5);
            FileOutputStream fileOutputStream =
                    new FileOutputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeTriangle.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(triangle);
            objectOutput.close();
            fileOutputStream.close();
            System.out.println(
                    "Serialized data is saved in /Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeTriangle.ser");
        }
        if (true) { //Make it to true to deserialize an object

            Triangle deTriangle = null;
            FileInputStream fileInputStream =
                    new FileInputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeTriangle.ser");
            ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
            deTriangle = (Triangle) objectInput.readObject();
            objectInput.close();
            fileInputStream.close();
            System.out.println("Deserializing: " + deTriangle.toString());
            System.out.println("Perimeter = " + deTriangle.calculatePerimeter());
            System.out.printf("Area = %.2f \n", deTriangle.calculateArea());
        }
    }
}

