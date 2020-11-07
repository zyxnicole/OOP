package exercise3;

import exercise2.Circle;
import exercise2.Square;

import java.io.*;

/**
 * Program: INFO5100
 * Description: Serialization of exercise 2
 * CreatedBy: Nicole_Z
 * CreatDate: 11/07/2020
 **/

public class SerializeSquare {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (true) { //Make it to true to serialize an object
            Square square = new Square(3);
            FileOutputStream fileOutputStream =
                    new FileOutputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeSquare.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(square);
            objectOutput.close();
            fileOutputStream.close();
            System.out.println(
                    "Serialized data is saved in /Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeSquare.ser");
        }
        if (true) { //Make it to true to deserialize an object

            Square deSquare= null;
            FileInputStream fileInputStream =
                    new FileInputStream("/Users/EMMA/Documents/NEU2020/INFO5100/exercise3/SerializeSquare.ser");
            ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);
            deSquare = (Square) objectInput.readObject();
            objectInput.close();
            fileInputStream.close();
            System.out.println("Deserializing: " + deSquare.toString());
            System.out.println("Perimeter = " + deSquare.calculatePerimeter());
            System.out.printf("Area = %.2f \n", deSquare.calculateArea());
        }
    }
}

