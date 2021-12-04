 
package association;
 
import java.util.ArrayList;

public class Department {
 
   private static ArrayList<CSE> cseStudents ;
   private static ArrayList<EEE> eeeStudents;
   private Students student;
   private ArrayList<Students> students;
   private String name ;
   Department(){
   
   }
   
   Department(String name,ArrayList<Students> students){
   this.name = name;
   this.students = students;
   }
   
   public String getName(){
      return name;
    }
   
   public ArrayList<Students> getStudents(){
      return  students;
    }
   
}
