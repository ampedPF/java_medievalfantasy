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
public abstract class Personnage {
    private int hp;
    private int str;
    private Combat monStyleDeCombat;
    
    public int getHitPoint(){
        return this.hp;
    }
    
    public Personnage(Combat c){
        this.monStyleDeCombat = c;
    }
    
    public abstract void afficheToi();
    
    public void batsToi(){
        monStyleDeCombat.executeToi();
    }
    
    public void setStyleDeCombat(Combat c){
        monStyleDeCombat = c;
    }
   
    public void setHitPoint(int hp){
        this.hp = hp;
    }
    
    public void setStrength(int str){
        this.str = str;
    }
    
    public void attackTarget(Personnage p){
        if(p.getHitPoint() > 0){
            batsToi();
            p.setHitPoint(p.getHitPoint()-this.str);
        }
    }

    public void isDead(){
        if(this.hp <= 0){
            System.out.println("I'm dead");
        }
    }
}
