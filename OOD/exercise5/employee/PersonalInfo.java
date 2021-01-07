package exercise5.employee;

public class PersonalInfo {

  /**
   * Program: INFO5100
   * Description:
   * CreatedBy: Nicole_Z
   * CreatDate: 11/30/2020
   **/

  private final String birthday;
  private final String address;

  public static Builder builder() {
    return new Builder();
  }

  public String getBirthday() {
    return birthday;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "PersonalInfo {" +
        "\nBirthday='" + birthday + '\'' +
        ", \nAddress='" + address + '\'' +
        '}';
  }

  private PersonalInfo(String birthday, String address) {
    this.birthday = birthday;
    this.address = address;
  }

  public static class Builder {

    private String birthday = "";
    private String address = "";

    public Builder setBirthday(String birthday) {
      this.birthday = birthday;
      return this;
    }

    public Builder setAddress(String address) {
      this.address = address;
      return this;
    }

    public PersonalInfo build() {
      return new PersonalInfo(birthday, address);
    }
  }
}
