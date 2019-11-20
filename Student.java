public class Student extends Person {
  
  String major;
  int s_id;
  
  public Student() {
  }
  //Set and get student ID
  public void setSID(int s_id) {
    this.s_id = s_id;
  }
  public int getSID() {
    return s_id;
  }
  //Set and get student's major
  public void setMajor(String major) {
    this.major = major;
  }
  public String getMajor() {
    return major;
  }
  //Return student's format
  @Override
  public String toString() {
    return String.format("Student: %s, %s\nStudent ID: %d\nMajor: %s\n", super.l_name, super.f_name,
                         s_id, major);
  }
}