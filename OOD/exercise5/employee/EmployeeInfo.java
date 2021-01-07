package exercise5.employee;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/30/2020
 **/

public class EmployeeInfo {

  private final long id;
  private final String name;
  private final String occupation;
  private final PersonalInfo personalInfo;

  EmployeeInfo(long id, String name, String occupation, PersonalInfo personalInfo) {
    this.id = id;
    this.name = name;
    this.occupation = occupation;
    this.personalInfo = personalInfo;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getOccupation() {
    return occupation;
  }

  public PersonalInfo getPersonalInfo() {
    return personalInfo;
  }

  @Override
  public String toString() {
    return "EmployeeInfo {" +
        "\nId=" + id +
        ", \nName='" + name + '\'' +
        ", \nOccupation='" + occupation + '\'' +
        ", \nPersonalInfo=" + personalInfo +
        "}\n";
  }
}
