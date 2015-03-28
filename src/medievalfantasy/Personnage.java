/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medievalfantasy;

import java.math.MathContext;
import java.util.Random;

/**
 *
 * @author ampedPF
 */
public abstract class Personnage {
    private int hp;
    private int str;
    private int agi;
    private Combat monStyleDeCombat;
    private String name;
    private String msgDeath;
    
  
    public Personnage(Combat c){
        this.monStyleDeCombat = c;
    }
    
    /*
        Getters & Setters
    */
    
    public int getHitPoint(){
        return this.hp;
    }
   
    public void setHitPoint(int hp){
        this.hp = hp;
    }
    
    public int getStrength(){
        return this.str;
    }
    
    public void setStrength(int str){
        this.str = str;
    }
    
    public int getAgility(){
        return this.agi;
    }
    
    public void setAgility(int agi){
        this.agi = agi;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDeathMessage(){
        return this.msgDeath;
    }
    
    public void setDeathMessage(String msg){
        this.msgDeath = msg;
    }
    
    
    public abstract void afficheToi();
    
    public void batsToi(){
        monStyleDeCombat.executeToi();
    }
    
    public void setStyleDeCombat(Combat c){
        monStyleDeCombat = c;
    }
    
    public void attackTarget(Personnage p){
        if(p.getHitPoint() > 0){
            if(!p.dodgeAttack()){
                System.out.println(this.name + " hits " + p.name + " and inflicts " + this.str + " damages");
                batsToi();
                p.setHitPoint(p.getHitPoint()-this.str);
            } else {
                System.out.println(this.name + " misses " + p.name);
            }
        }
    }

    public boolean dodgeAttack(){
        Random rand = new Random();
        boolean dodge = true;
        if(rand.nextInt(10)+1>this.agi){
            dodge = false;
        }
        return dodge;
    }
    public boolean isDead(){
        boolean result = false;
        if(this.hp <= 0){
            result = true;
            System.out.println(msgDeath);
        }
        return result;
    }
}
