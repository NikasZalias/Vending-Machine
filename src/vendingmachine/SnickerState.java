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
public class SnickerState implements State {
    @Override
    public void doAction(Context context) {
        final ImageIcon snickers = new ImageIcon("mars_snickers.png");
        JOptionPane.showMessageDialog(null, "Your choise is Snickers", "Snickers", 2, snickers);
        context.setState(this); 
        context.setPrice(0.80);
    }
    @Override
    public String toString() {
        return "Snickers";
    }
}
