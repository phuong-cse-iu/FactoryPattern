/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorytestdrive;

/**
 *
 * @author TranT.Phuong
 */
public class FactoryTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza pizza = null;
        SimpleFactory factory = new SimpleFactory();
        pizza = factory.createPizza("clam");
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
    }
    
}
