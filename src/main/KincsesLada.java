/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modell.JatekModell;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;

public class KincsesLada {

    public static void main(String[] args) {
        
        JatekModell modell=new JatekModell();
        KonzolNezet nezet=new KonzolNezet();
        
        new KonzolVezerlo(modell, nezet);
    }
    
}
