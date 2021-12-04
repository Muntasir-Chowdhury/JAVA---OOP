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
public class A implements MyListener{

    @Override
    public void onGeekEvent() {

        System.out.println("Performing callback after synchronous Task");

    }
    
}
