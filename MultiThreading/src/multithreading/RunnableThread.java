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
public class RunnableThread implements Runnable {

    
     int threadNumber;
   RunnableThread(int threadNumber)
   {
     this.threadNumber = threadNumber; 
   }
    @Override
    public void run() {
        
    for(int i=1; i<=5; i++){
           System.out.println(""+i+" from Runnablethread: "+threadNumber);
   try{
   Thread.sleep(1000);
   }catch(Exception e){
   
   } }
    }
    
}
