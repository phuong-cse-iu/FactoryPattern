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
public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("clam")) {
                pizza = new ClamPizza();
          }
        return pizza;
    }
    
}
