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
public class Brigand extends Personnage{
    public Brigand(String name){
        super(new CombatAuCouteau());
        setName(name);
        setHitPoint(4);
        setStrength(2);
        setAgility(5);
        setDeathMessage("Nooooooo.....");
    }

    @Override
    public void afficheToi() {
        System.out.println("Brigand " + getHitPoint());
    }
}
