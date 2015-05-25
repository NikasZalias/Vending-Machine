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
public class SubmarineState implements State {
    @Override
    public void doAction(Context context) {
        final ImageIcon submarine = new ImageIcon("submarine.jpg");
        JOptionPane.showMessageDialog(null, "Your choise is Submarine", "Submarine", 2, submarine);
        context.setState(this);
        context.setPrice(3.00);
    }
    @Override
    public String toString() {
        return "Submarine";
    }
}
