/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;

public class KonzolNezet {
    
    private static final Scanner sc=new Scanner(System.in);
        
    public void megjelenit(String uzenet){
        System.out.println(uzenet);
    }

    public int bekeres() {
        megjelenit("Melyik ládában van a kincs? (1,2,3)");
        return sc.nextInt()-1;
        
    }
}
