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
    public class UsingOverRiding {
 
        interface Algebra {
            int add(int a);
        }
 
        public static void main(String[] args) {
  
            //Declaring a variable
            int x = 20;
  
            Algebra alg = a -> {
                                 
                                 return a + x;
                               };
            System.out.println("10 + 20 = " + alg.add(10));

            //Above will generate error saying variable x is already defined in main(String[])
            //Because lambda expression doesn't define a new scope.
            //But anonymous class does, so comment the above one and
            //try the below one, it will work fine
  
            //Using Anonymous class
            Algebra alg1 = new Algebra() {
   
                @Override
                public int add(int a) {
                    int x = 20;
                    return a + x;
                }
            };
            System.out.println("10 + 20 = " + alg1.add(10));
        }
    }
