/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.CuiVezerlo;


public class KincsesLada {

    public static void main(String[] args) {
        
        JatekModell modell=new JatekModell();
//        KonzolNezet nezet=new KonzolNezet();
//        FelugroNezet felNezet=new FelugroNezet();
//        
//        //new KonzolVezerlo(modell, nezet);
//        new FelugroVezerlo(modell, felNezet);

    //POLIM,ORFIZMUS,közös őst csinálunk, így hivatkozni tudunk az utódaira
        CuiNezet nezet;
        nezet = new FelugroNezet();
        //nezet = new FelugroNezet();
        new CuiVezerlo(modell, nezet);
    }
    
}
