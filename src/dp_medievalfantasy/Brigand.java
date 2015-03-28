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
public class Brigand extends Personnage{
    public Brigand(){
        super(new CombatAuCouteau());
        setHitPoint(4);
        setStrength(2);
    }

    @Override
    public void afficheToi() {
        System.out.println("Brigand " + getHitPoint());
    }
}
