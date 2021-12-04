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
public class MultiThread extends Thread {
    
   int threadNumber;
   MultiThread(int threadNumber)
   {
     this.threadNumber = threadNumber; 
   }
    
    
    
   @Override
   public void run(){
   for(int i=1; i<=5; i++){
           System.out.println(""+i+" from Thread: "+threadNumber);
   try{
   Thread.sleep(500);
   }catch(Exception e){
   
   }
   }
   }
    
    
}
