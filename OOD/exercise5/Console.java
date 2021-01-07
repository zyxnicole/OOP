package exercise5;
import exercise5.employee.EmployeeInfo;
import exercise5.employee.EmployeeInfoFactory;
import exercise5.employee.PersonalInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/30/2020
 **/

public class Console {

  public static void main(String[] args) {
    EmployeeInfoFactory employeeInfoFactory = EmployeeInfoFactory.getFactory();
    List<EmployeeInfo> employeeInfos = new ArrayList<>();

    System.out.println("Welcome to the employee info system!\nPlease follow steps to input.");
    Scanner in = new Scanner(System.in);
    boolean hasNext = true;

    while (hasNext) {
      String name = "";
      String occupation = "";
      String birthday = "";
      String address = "";
      while (name.equals("")) {
        System.out.println("[Required] Please input the name of the employee:");
        name = in.nextLine().trim();
      }

      while (occupation.equals("")) {
        System.out.println("[Required] Please input the occupation of the employee:");
        occupation = in.nextLine().trim();
      }

      System.out.println("[Optional] Please input the birthday of the employee:");
      birthday = in.nextLine().trim();

      System.out.println("[Optional] Please input the address of the employee:");
      address = in.nextLine().trim();

      PersonalInfo personalInfo = PersonalInfo.builder()
          .setBirthday(birthday)
          .setAddress(address)
          .build();

      EmployeeInfo employeeInfo = employeeInfoFactory.create(name, occupation, personalInfo);
      employeeInfos.add(employeeInfo);
      System.out.println("More employee info to input? [Y/N], default Y");
      if (in.nextLine().trim().toUpperCase().equals("N")) {
        hasNext = false;
      }
    }

    System.out.println("Received employee information:");
    for (EmployeeInfo e : employeeInfos) {
      System.out.println(e.toString());
    }
  }

}
