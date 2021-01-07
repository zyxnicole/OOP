package exercise5.employee;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/30/2020
 **/

public class EmployeeInfoFactory {

  private static EmployeeInfoFactory factory;
  private static long id;

  public static EmployeeInfoFactory getFactory() {
    if (factory == null) {
      factory = new EmployeeInfoFactory();
      id = 0L;
    }
    return factory;
  }

  public EmployeeInfo create(String name, String occupation, PersonalInfo personalInfo) {
    return new EmployeeInfo(id++, name, occupation, personalInfo);
  }

  private EmployeeInfoFactory() {}
}
