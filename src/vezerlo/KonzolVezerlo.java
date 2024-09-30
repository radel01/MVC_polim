/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.JatekModell;
import nezet.KonzolNezet;

public class KonzolVezerlo {
    private JatekModell modell;
    private KonzolNezet nezet;

    public KonzolVezerlo(JatekModell modell, KonzolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        strat();
    }

    public void strat() {
        nezet.megjelenit(modell.kezdes());
        modell.setValasztas( nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
        
    }
    
    
}
