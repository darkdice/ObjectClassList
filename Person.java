public class Person {
  
  String f_name, l_name;
  int age;
  
  public Person() {
  }
  //Set and get first name
  public void setFirstName(String f_name) {
    this.f_name = f_name;
  }
  public String getFirstName() {
    return f_name;
  }
  //Set and get last name
  public void setLastName(String l_name) {
    this.l_name = l_name;
  }
  public String getLastName() {
    return l_name;
  }
  //Set and get age of person
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }
  //Return string format of person
  public String toString() {
    return String.format("First Name: %s, Last Name: %s\nAge: %d\n", f_name, l_name, age);
  }
}