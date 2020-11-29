package Dungeon.Enemies;

import Dungeon.IEnemy;

import java.util.Random;

public class Dragon implements IEnemy{
    private int health;
    private int basicAttack;
    private int breathAttack;
    private int tailAttack;
    private int scaleArmour;

    public Dragon(int health, int breathAttack, int scaleArmour){
        this.health = health;
        this.breathAttack = breathAttack;
        this.basicAttack = 20;
        this.tailAttack = 50;
        this.scaleArmour = scaleArmour;
    }

    public int attackPlayer() {
        Random random = new Random();
        int randomUpTo10 = random.nextInt(9) +1;
        int attackChoice = 2;
        if(attackChoice >= 8){
            return breathAttack;
        } else if(attackChoice == 7){
            return tailAttack;
        }
        return basicAttack;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        health -= (damage-scaleArmour);
    }
}
