/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancewithinterface;

/**
 *
 * @author muntasir
 */
public class InheritanceWithInterface  implements Boss{
    
    
     
    public static void main(String[] args) {
        Employee obj= new Employee();
        int x = obj.doThisWork();
        System.out.println(""+x);
        
        Medium obj2 = new Medium(){
            @Override
            public int doThisWork() {
             return 7;              
            }
        
        
        };
        System.out.println(""+obj2.doThisWork());
         
    }

    @Override
    public void displayBoss() {
        System.out.println("Hello I am Boss.");
     }

     
    
}
