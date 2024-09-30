/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.KonzolNezet;

public class KonzolVezerlo {
    private JatekModell modell;
    private CuiNezet nezet;

    public KonzolVezerlo(JatekModell modell, CuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        start();
    }

    public void start() {
        nezet.megjelenit(modell.kezdes());
        modell.setValasztas( nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
        
    }
    
    
}
