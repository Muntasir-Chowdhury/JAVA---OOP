 
package customexceptionhandling;

/**
 *
 * @author muntasir
 */
public class RethrowException {
      
    static int div(int a,int b){
      int i = a/b;
      return i;
    
    }
    
    static void comp(int a)   
    {
         
        try{
        
        throw new NullPointerException("Gotcha");
        
        } catch(NullPointerException e){
            System.out.println(""+e.getMessage());
            throw e;
        
        } finally{
        
            System.out.println("I rule here");
        }
     
         
          
    
    }
    
    
    public static void main(String[] args) {
        int a=1,b=1;
        try{
             comp(a);
        }catch(Exception e)
        {
            System.out.println("here again "+e.getMessage());
        }
         
        
    }
}