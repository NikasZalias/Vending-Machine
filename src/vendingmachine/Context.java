/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Nikas Zalias
 */
public class Context {
    private State state;
    private double price;
    
    public Context() {
        state = null;
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
