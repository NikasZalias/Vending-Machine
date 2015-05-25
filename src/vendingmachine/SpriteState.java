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
public class SpriteState implements State {
    @Override
    public void doAction(Context context) {
        final ImageIcon sprite = new ImageIcon("sprite.jpg");
        JOptionPane.showMessageDialog(null, "Your choise is Sprite", "Sprite", 2, sprite);
        context.setState(this);
        context.setPrice(1.00);
    }
    @Override
    public String toString() {
        return "Sprite";
    }
}
