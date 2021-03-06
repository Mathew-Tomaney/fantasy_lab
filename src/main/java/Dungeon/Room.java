package Dungeon;

import Players.Player;

import java.util.ArrayList;
import java.util.Collections;

public class Room {

    private String name;
    private int roomNumber;
    private Treasure treasure;
    private IEnemy enemy;
    private ArrayList<Player> players;


    public Room(String name, int roomNumber, Treasure treasure, IEnemy enemy) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.enemy = enemy;
        this.treasure = treasure;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public IEnemy getEnemy() {
        return this.enemy;
    }

    public Treasure getTreasure() {
        return this.treasure;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }

    public void randomiseOrder() {Collections.shuffle(this.players);}

    public boolean enemyIsDead() {
        if (this.getEnemy().getHealth() <= 0) {
            return true;
            } else {
                return false;
        }
    }

    public void damageEnemy(int damage) {
        this.getEnemy().reduceHealth(damage);
    }

    public String gameOver(){
        return "You died.";
    }

    public void removeCasualties(){
        for(Player player : players){
            if(player.getHealth() <= 0){
                players.remove(player);
            }
        }
        if(players.size() == 0){
            gameOver();
        } else {
            lootRoom(players.get(0));
        }
    }

    public void fight() {
        randomiseOrder();
        Player injuredPlayer = players.get(0);
        for(Player playerHealth : this.players) {
            if (playerHealth.getHealth() < injuredPlayer.getHealth()) {
                injuredPlayer = playerHealth;
            }
        }
        for(Player player : players) {
            if (player.action() >= 0) {
                this.damageEnemy(player.action());
            } else {
                if (injuredPlayer.getHealth() < 100) {
                    injuredPlayer.setHealth(player.action());
                }
            }
        }
        this.players.get(0).takeDamage(this.getEnemy().attackPlayer());
        removeCasualties();

    }

    public void lootRoom(Player player) {
        if (enemyIsDead()) {
             player.collect(getTreasure());
             players.clear();
        } else {
            fight();
        }
    }


}


