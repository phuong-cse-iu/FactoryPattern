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
public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza");
    }
    
}
