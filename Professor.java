public class Professor extends Person {
  
  String dept, teach;
  int p_id;
  
  public Professor() {
  }
  //Set and get professor's department
  public void setDept(String dept) {
    this.dept = dept;
  }
  public String getDept() {
    return dept;
  }
  //Set and get prof's class they teach
  public void setTeach(String teach) {
    this.teach = teach;
  }
  public String getTeach() {
    return teach;
  }
  //Set and get prof's ID
  public void setPID(int p_id) {
    this.p_id = p_id;
  }
  public int getPID() {
    return p_id;
  }
  //Return professor's format
  @Override
  public String toString() {
    return String.format("Professor: %s, %s\nProfessor ID: %d\nDepartment: %s\nClass: %s\n", super.l_name,
                         super.f_name, p_id, dept, teach);
  }
}