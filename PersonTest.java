/* David D'Amico - CSI 311 - Assignment 4
 * This program is meant to create multiple objects of persons: students or professors
 * into a list directory with different options to choose from */
import java.util.*;

/* Main test function of program */
public class PersonTest {
  
  public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);
    int menu_in, age, id;
    String position, str;
    
    
    
    Person person = new Person();
    List<Person> people = new ArrayList<Person>();
    
    //a-c: create and remove objects. d: print objects of list
    //e: use of structure. f: search for object. g: print objects to text file
    //h: read from a text file
    //i: exit
    System.out.println("Welcome to the UAlbany Directory! Choose an option:");
    do{ 
      System.out.println("1 - Add student or professor info\n" +
                         "2 - Delete student or professor info\n" +
                         "3 - Print out directory\n" +
                         "4 - Search the directory\n" +
                         "5 - Print out directory to file\n" +
                         "6 - Read input from text file\n" +
                         "0 - Quit the program\n");
      menu_in = input.nextInt();
      //Menu switch-case
      switch(menu_in) {
      //Add person info
        case 1:
          System.out.println("Enter choice of 'student' or 'professor': ");
          position = input.next();
    
          if(position.equalsIgnoreCase("professor")) {
            Professor prof = new Professor();
            System.out.println("New person is: Professor");
            System.out.println("Enter professor's ID: ");
            id = input.nextInt();
            prof.setPID(id);
            System.out.println("Enter their last name: ");
            str = input.next();
            prof.setLastName(str);
            System.out.println("Enter their first name: ");
            str = input.next();
            prof.setFirstName(str);
            System.out.println("Enter professor's department: ");
            str = input.next();
            prof.setDept(str);
            System.out.println("Enter their class: ");
            str = input.next();
            prof.setTeach(str);
            
            people.add(prof);
            
          }
          else if(position.equalsIgnoreCase("student")) {
            Student student = new Student();
            System.out.println("New person is: Student");
            System.out.println("Enter student's ID: ");
            id = input.nextInt();
            student.setSID(id);
            System.out.println("Enter student's last name: ");
            str = input.next();
            student.setLastName(str);
            System.out.println("Enter student's first name: ");
            str = input.next();
            student.setFirstName(str);
            System.out.println("Enter student's major: ");
            str = input.next();
            student.setMajor(str);
            
            people.add(student);
          }
          else {
            System.out.println("Person is just a regular person here");
            System.out.println("Enter person's last name: ");
            str = input.next();
            person.setLastName(str);
            System.out.println("Enter person's first name: ");
            str = input.next();
            person.setFirstName(str);
            System.out.println("Enter their age: ");
            age = input.nextInt();
            person.setAge(age);
            
            people.add(person);
          }
        case 2:
        //function to delete employee object
        
        case 3:
         //function to print through list
          System.out.println(Arrays.toString(people.toArray()));
         
        case 4:
          //function to search through directory
        
        case 5:
          //function to print list to text file
        
        case 6:
          //function to read from text file for input
          
    }//switch
  }//do, input of 0 quits program
  while(menu_in != 0);
  
  }
}