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
public class Troll extends Personnage{
    public Troll(){
        super(new CombatALaHache());
        setHitPoint(6);
        setStrength(4);
    }
    
    @Override
    public void afficheToi() {
        System.out.println("Troll " + getHitPoint());
    }
}
