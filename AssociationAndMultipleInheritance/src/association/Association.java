/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muntasir
 */
public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Students> eeestudents = new ArrayList<>();
        ArrayList <Students> csestudents = new ArrayList<>();
        ArrayList<Department> depts = new ArrayList<>();
         csestudents.add(new Students("Muntasir",24,"CSE"));
         csestudents.add(new Students("Samy",24,"CSE"));
         csestudents.add(new Students("Nasif",23,"CSE"));
         
         eeestudents.add(new Students("Abir",24,"EEE"));
         eeestudents.add(new Students("Samir",24,"EEE"));
         eeestudents.add(new Students("Nasir",23,"EEE"));
         
        Department cse = new Department("CSE",csestudents);
        Department eee = new Department("EEE",eeestudents);
        
        depts.add(cse);
        depts.add(eee);
        
        for(Department d: depts)
        {
        ArrayList<Students> avStudents = d.getStudents();
            System.out.println(""+d.getName());
            for(Students s: avStudents)
            {
                System.out.println(""+s.getName()+" "+s.showWork());
            }
            System.out.println("");
        
        }
        
        Students cseStudent = new Students("Ratul",24,"CSE") ;
        System.out.println(""+cseStudent.showApp());
        
    }
    
}
