/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievalfantasy;

import java.util.ArrayList;

/**
 *
 * @author ampedPF
 */
public class MedievalFantasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ArrayList<Personnage> liste = new ArrayList<>();
        liste.add(new Troll());
        liste.add(new Chevalier());
        
        for (Personnage p : liste) {
            p.afficheToi();
            p.batsToi();
        }
        
        liste.get(0).setStyleDeCombat(new CombatAuSabre());
        liste.get(1).setStyleDeCombat(new CombatAuCouteau());
        
        for (Personnage p : liste) {
            p.afficheToi();
            p.batsToi();
        }*/
        
        Troll troll = new Troll("Turol");
        Chevalier chev = new Chevalier("Arthur");
        
        Duel trollVSchev = new Duel(troll, chev);
        trollVSchev.start();
    }
    
}
