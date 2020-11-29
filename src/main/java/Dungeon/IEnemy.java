package Dungeon;

import java.util.ArrayList;

public interface IEnemy {

    int attackPlayer();
    int getHealth();
    void reduceHealth(int damage);
}
