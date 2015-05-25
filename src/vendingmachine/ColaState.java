/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikas Zalias
 */
public class ColaState implements State{

    @Override
    public void doAction(Context context) {
        final ImageIcon cola = new ImageIcon("coca_cola.png");
        JOptionPane.showMessageDialog(null, "Your choise is Coca-Cola", "Coca-cola", 2, cola);
        context.setState(this);
        context.setPrice(1.20);
    }
    @Override
    public String toString() {
        return "Coca-Cola";
    }   
}
