package Dungeon.Enemies;

import Dungeon.IEnemy;

public class Goblin implements IEnemy {
    
    private int health;
    private int basicAttack;
    
    public Goblin(){
        this.health = 10;
        this.basicAttack = 5;
    }

    public int attackPlayer() {
        return this.basicAttack;
    }

    public int getHealth() {
        return this.health;
    }

    public void reduceHealth(int damage){
        this.health -= damage;
    }
}
