/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_medievalfantasy;

/**
 *
 * @author ampedPF
 */
public class Chevalier extends Personnage{
    public Chevalier(){
        super(new CombatAuSabre());
        setHitPoint(5);
        setStrength(3);
    }
    
    @Override
    public void afficheToi() {
        System.out.println("Chevalier " + getHitPoint());
    }
}
