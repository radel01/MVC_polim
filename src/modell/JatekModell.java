/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

public class JatekModell {

    private final Lada[] ladak;
    private int valasztas;
    
    //osztaly, adattag, konstruktor-paraméter? hányféle, adattag?

    public JatekModell() {
        ladak = new Lada[3];
        valasztas= -1;
        ladak[0]= new Lada("arany", "Én rejtem a kincset!");
        ladak[1]= new Lada("ezüst", "Nem én rejtem a kincset!", true);
        ladak[2]= new Lada("bronz", "Az arany hazudik!");
        
    }

    public String kezdes() {
        String s="Hol a kincs? Csak az egyik felirat igaz!\n";
        int i =1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i++ + ". "+a+"láda --> "+f+"\n";
        }
        return s;
    }

    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }
    
    public String ellenorzes() {
        String talalt="Gratulálunk, eltaláltad!";
        String nemTalalt="Sajnos nem talált!";
        return ladak[valasztas].isKincs() ? talalt : nemTalalt;
    }
    
    
}
