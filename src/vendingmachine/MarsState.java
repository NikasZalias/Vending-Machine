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
public class MarsState implements State {
    @Override
    public void doAction(Context context) {
        final ImageIcon mars = new ImageIcon("mars.png");
        JOptionPane.showMessageDialog(null, "Your choise is Mars", "Mars", 2, mars);
        context.setState(this);
        context.setPrice(0.75);
    }
    @Override
    public String toString() {
        return "Mars";
    }
}
