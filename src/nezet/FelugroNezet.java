/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class FelugroNezet {
    private static final Scanner sc=new Scanner(System.in);
        
    public void megjelenit(String uzenet){
        JOptionPane.showMessageDialog(null, uzenet);
    }

    public int bekeres() {
        String felugro=JOptionPane.showInputDialog(null,"Melyik ládában van a kincs? (1,2,3)");     
        return Integer.parseInt(felugro)-1;
    }
}
