/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumAndLambda;

/**
 *
 * @author muntasir
 */
public class EnumInJava {
    
   interface Order {
            String say(House house);
        }
 
        enum House {
            DOOR, WINDOW, GATE
        }
 
        public static void main(String[] args) {
  
            Order sh = 
                    (House house) -> {
                            if(house == House.DOOR) {
                                return "Open the door";
                            } else {
                                return "Open the window";
                            }
                     };
            System.out.println(sh.say(House.DOOR));
            System.out.println(sh.say( House.WINDOW));
        }
    
}
