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
public class Duel {
    private Personnage duelist1;
    private Personnage duelist2;
    
    public Duel(Personnage duelist1, Personnage duelist2){
        this.duelist1 = duelist1;
        this.duelist2 = duelist2;
    }
    
    public Personnage getDuelist1(){
        return this.duelist1;
    }
    
    public void setDuelist1(Personnage duelist){
        this.duelist1 = duelist;
    }
    
    public Personnage getDuelist2(){
        return this.duelist2;
    }
    
    public void setDuelist2(Personnage duelist){
        this.duelist2 = duelist;
    }
    
    public boolean isOver(){
        boolean result = false;
        if(this.duelist1.isDead() || this.duelist2.isDead()){
            result = true;
        }
        return result;
    }
    public Personnage getWinner(){
        Personnage winner = this.duelist1;
        if(this.duelist1.isDead()){
            winner = this.duelist2;
        }
        return winner;
    }
    
    public void start(){
        int round = 1;
        while(!this.isOver()){
            System.out.println("Round " + round);
            switch(round%2){
                case 1:
                    this.duelist1.afficheToi();
                    this.duelist2.afficheToi();
                    this.duelist1.attackTarget(this.duelist2);
                    break;
                case 0:
                    this.duelist1.afficheToi();
                    this.duelist2.afficheToi();
                    this.duelist2.attackTarget(this.duelist1);
                    break;
            }
            round++;
        }
        System.out.println(this.getWinner().getName() + " wins!");
    }
            
}
