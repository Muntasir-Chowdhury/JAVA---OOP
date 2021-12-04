 
package customexceptionhandling;

/**
 *
 * @author muntasir
 */
public class CustomExceptionHandling {

    /**
     * @param args the command line arguments
     */
    static int div(int a,int b){
      int i = a/b;
      return i;
    
    }
    
    static int comp(int a,int b) throws IllegalArgumentException
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
        }catch(IllegalArgumentException e)
        {
            System.out.println(""+e.getMessage());
        }
    }
    
}
