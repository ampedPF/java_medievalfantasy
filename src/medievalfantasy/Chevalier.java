/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievalfantasy;

/**
 *
 * @author ampedPF
 */
public class Chevalier extends Personnage{
    public Chevalier(String name){
        super(new CombatAuSabre());
        setName(name);
        setHitPoint(5);
        setStrength(3);
        setAgility(3);
        setDeathMessage("It cannot be...");
    }
    
    @Override
    public void afficheToi() {
        System.out.println("Chevalier " + getHitPoint());
    }
}
