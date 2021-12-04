/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synandasyn;

/**
 *
 * @author muntasir
 */
public class SynAndAsyn {
    
    private MyListener mListener;
    
    public void registerListener(MyListener mListener){
    
    this.mListener = mListener;
    }
    public void doGeekStuff()
    {
  
        // perform any operation
        System.out.println("Performing callback before synchronous Task");
        
  
        // check if listener is registered.
        if (this.mListener != null) {
  
            // invoke the callback method of class A
            mListener.onGeekEvent();
        }
    }
    public void doGeekStuff2()
    {
          // An Async task always executes in new thread
        new Thread(new Runnable() {
            @Override
            public void run()
            {
  
                // perform any operation
                System.out.println("Performing operation in Asynchronous Task");
  
                // check if listener is registered.
                if (mListener != null) {
  
                    // invoke the callback method of class A
                    mListener.onGeekEvent();
                }
            }
        }).start();
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        //Synchronous Call
        SynAndAsyn ob1 = new SynAndAsyn();
        MyListener mListener = new A();
        ob1.registerListener(mListener);
        ob1.doGeekStuff();
        
          SynAndAsyn ob2 = new SynAndAsyn();
        ob2.registerListener(mListener);
        ob2.doGeekStuff2();
      
    }
    
}
