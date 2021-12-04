/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author muntasir
 */
public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       for(int i=1; i<=5; i++)
       {MultiThread m = new MultiThread(i);
         m.start();
         }
       
        System.out.println("Runnable: ");
       for(int i=1; i<=5; i++)
       {RunnableThread m = new RunnableThread(i);
       Thread obj = new Thread(m);  
       
       obj.start();
       try{obj.join(); //it will stop other threads from executing at the same to time
       }catch (Exception e){
       
       }  
       }
        
    }
    
}
