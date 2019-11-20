/* David D'Amico - CSI 311 - Assignment 4
 * This program is meant to create multiple objects of persons: students or professors
 * into a list directory with different options to choose from */
import java.util.*;

/* Main test function of program */
public class Persontest {
  
  public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);
    int menu_in, age, id, rmv;
    String position, str, trap, search;
    
    
    
    Person person = new Person();
    List<Person> peoples = new ArrayList<Person>();
    
    
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
          System.out.println("Enter choice of 'person' or 'student' or 'professor': ");
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
            trap = input.nextLine();
            str = input.nextLine();
            prof.setDept(str);
            System.out.println("Enter their class: ");
            str = input.nextLine();
            prof.setTeach(str);
            
            peoples.add(prof);
            
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
            trap = input.nextLine();
            str = input.nextLine();
            student.setMajor(str);
            
            peoples.add(student);
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
            
            peoples.add(person);
          }
        
          break;
      case 2:
        //function to delete employee object
        	System.out.println("Please check the list to see who you wish to remove (1st is 0).");
        	System.out.println("Enter index of list to remove the person from directory: ");
        	rmv = input.nextInt();
        	peoples.remove(rmv);
        
        	break;
      case 3:
         //function to print through list
        	System.out.println(Arrays.toString(peoples.toArray()));
        
        	break;
      case 4:
          //function to search through directory for person
    	  //if exists, print object otherwise if DOESNT exists, print error
    	  System.out.println("Enter first or last name to search for in directory: ");
    	  trap = input.nextLine();
    	  search = input.nextLine();
    	  for(Person person : peoples) {
    	  if(peoples.contains(search)) {
    		  System.out.println("Name has been found!");
    		  }
    	  }
    	  break;
      case 5:
          //function to print list to text file
        
    	  break;
      case 6:
          //function to read from text file for input
        
    	  break;
    }//switch
  }//do, input of 0 quits program
  while(menu_in != 0);
  
    
  }
}
