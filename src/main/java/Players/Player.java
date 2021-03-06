package Players;

import Dungeon.Treasure;

public abstract class Player {

    private String name;
    private int health;
    private int maxHealth;
    private int gold;

    public Player(String name){
        this.name = name;
        this.maxHealth = 100;
        this.health = this.maxHealth;
        this.gold = 0;

    }
    
    public String getName(){
        return this.name;
    } 
    
    public abstract int action();

    public abstract void swap(int index);

    public int getHealth(){
        return this.health;
    }

    public int getMaxHealth() { return this.maxHealth; }
    
    public void setHealth(int damage){
        this.health -= damage;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void collect(Treasure treasure){
        this.gold += treasure.getValue();
    }

    public String move(){
        return "Players.Player has moved";
    }

    public int getGold(){
        return this.gold;
    }
    
    public void increaseHealth(int health){
        this.health += health;
    }
}
