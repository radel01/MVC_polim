/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Scanner;

public class Jatek {
    private static final Scanner sc=new Scanner(System.in);
    private final Lada[] ladak;
    private int valasztas;
    
    //osztaly, adattag, konstruktor-paraméter? hányféle, adattag?

    public Jatek() {
        ladak = new Lada[3];
        valasztas= -1;
        ladak[0]= new Lada("arany", "Én rejtem a kincset!");
        ladak[1]= new Lada("ezüst", "Nem én rejtem a kincset!", true);
        ladak[2]= new Lada("bronz", "Az arany hazudik!");
        
        megjelenit(kezdes());
        bekeres();
        megjelenit(ellenorzes());
    }

    private String kezdes() {
        String s="Hol a kincs? Csak az egyik felirat igaz!\n";
        int i =1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + ". "+a+"láda --> "+f+"\n";
        }
        return s;
    }

    private void bekeres() {
        megjelenit("Melyik ládában van a kincs? (1,2,3)");
        valasztas= sc.nextInt();
        
    }
    
    private void megjelenit(String uzenet){
        System.out.println(uzenet);
    }

    private String ellenorzes() {
        String talalt="Gratulálunk, eltaláltad!";
        String nemTalalt="Sajnos nem talált!";
        return ladak[valasztas-1].isKincs() ? talalt : nemTalalt;
    }
    
    
}
