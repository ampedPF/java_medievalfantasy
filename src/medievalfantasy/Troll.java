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
public class Troll extends Personnage{
    public Troll(String name){
        super(new CombatALaHache());
        setName(name);
        setHitPoint(6);
        setStrength(4);
        setAgility(1);
        setDeathMessage("ughguhguuggh");
    }
    
    @Override
    public void afficheToi() {
        System.out.println("Troll " + getHitPoint());
    }
}
