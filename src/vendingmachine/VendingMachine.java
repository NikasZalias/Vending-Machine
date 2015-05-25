/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import Reader.Reader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikas Zalias
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String file_name = "VendingMachineProducts.txt";
        Reader file = new Reader(file_name);
        String[] aryLines = file.OpenFile();
        
        int snickersCount = Integer.parseInt(aryLines[2]);
        int marsCount = Integer.parseInt(aryLines[5]);
        int spriteCount = Integer.parseInt(aryLines[8]);
        int colaCount = Integer.parseInt(aryLines[11]);
        int submarineCount = Integer.parseInt(aryLines[14]);
        
        
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        double moneyToReturn = 0;
        double money = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the value you want to put into the machine:\n"));
        if (money > 0) {
            JOptionPane.showMessageDialog(null, aryLines);
            final int choise = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your choise:\n"));
            switch(choise) {
                case 1: 
                    if ((money == 0.80 || money > 0.80) && snickersCount != 0) {
                        snickersCount--;
                        SnickerState snickerState = new SnickerState() {};
                        snickerState.doAction(context);
                        moneyToReturn = money - context.getPrice();
                        JOptionPane.showMessageDialog(null, "Your return is: " + moneyToReturn + "\n");
                        break;
                    }
                    else {
                        System.out.print("You don't have enough money or there are no more Snickers\n");
                        break;
                    }     
                case 2:
                    if ((money == 0.75 || money > 0.75) && marsCount != 0) {
                        marsCount--;
                        MarsState marsState =  new MarsState();
                        marsState.doAction(context);
                        moneyToReturn = money - context.getPrice();
                        JOptionPane.showMessageDialog(null, "Your return is: " + moneyToReturn + "\n");  
                        break;
                    }
                    else {
                        System.out.print("You don't have enough money or there are no more Mars\n");
                        break;
                    }
                case 3:
                    if ((money == 1.00 || money > 1.00) && spriteCount != 0) {
                        spriteCount--;
                        SpriteState spriteState = new SpriteState();
                        spriteState.doAction(context);
                        moneyToReturn = money - context.getPrice();
                        JOptionPane.showMessageDialog(null, "Your return is: " + moneyToReturn + "\n");
                        break;
                    }
                    else {
                        System.out.print("You don't have enough money or there are no more Sprite\n");
                        break;
                    }
                case 4:
                    if ((money == 1.20 || money > 1.20) && colaCount != 0) {
                        colaCount--;
                        ColaState colaState = new ColaState();
                        colaState.doAction(context);
                        moneyToReturn = money - context.getPrice();
                        JOptionPane.showMessageDialog(null, "Your return is: " + moneyToReturn + "\n");
                        break;
                    }
                    else {
                        System.out.print("You don't have enough money or there are no more Coca-Cola\n");
                        break;
                    }
                case 5:
                    if ((money == 3.00 || money > 3.00) && submarineCount != 0) {
                        submarineCount--;
                        SubmarineState submarineState = new SubmarineState();
                        submarineState.doAction(context);
                        moneyToReturn = money - context.getPrice();
                        JOptionPane.showMessageDialog(null, "Your return is: " + moneyToReturn + "\n");
                        break;
                    }
                    else {
                        System.out.print("You don't have enough money or there are no more Submarines\n");
                        break;
                    }
                default:
                    System.out.print("There is no kind of this choise");
                    break;             
            }  
        }
        aryLines[2] = Integer.toString(snickersCount);
        aryLines[5] = Integer.toString(marsCount);
        aryLines[8] = Integer.toString(spriteCount);
        aryLines[11] = Integer.toString(colaCount);
        aryLines[14] = Integer.toString(submarineCount);
        
        PrintWriter writer = new PrintWriter(file_name, "UTF-8");
        for (int i = 0; i < aryLines.length; i++)
            writer.println(aryLines[i]);
        writer.close();
    }
    
}
