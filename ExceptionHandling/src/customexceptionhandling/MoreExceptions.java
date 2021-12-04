/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexceptionhandling;

/**
 *
 * @author muntasir
 */
public class MoreExceptions {
      /**
     * @param args the command line arguments
     */
    static int div(int a,int b){
      int i = a/b;
      return i;
    
    }
    
    static int comp(int a,int b) throws ArithmeticException
    {
       int i= 0;
        
           i = div(a,b);
         if(i==1)throw new IllegalArgumentException("The value is not needed");
         
          
    
     return i;
    }
    
    
    public static void main(String[] args) {
        int a=1,b=1;
        try{
        
          int i = comp(a,b);
            System.out.println(""+i);
        }catch(Exception e)
        {
            System.out.println("here "+e.getMessage());
        }
        //if i make b = 0 then i will get arithmetic one
        b = 0;
        try{
        
          int i = comp(a,b);
            System.out.println(""+i);
        }catch(ArithmeticException e)
        {
            System.out.println("here "+e.getMessage());
        }
        
    }
}
