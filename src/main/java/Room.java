import java.util.ArrayList;

public class Room {

    private String name;
    private int roomNumber;
    private Treasure treasure;
    private IEnemy enemy;

    public Room(String name, int roomNumber, Treasure treasure, IEnemy enemy){
        this.name = name;
        this.roomNumber = roomNumber;
        this.enemy = enemy;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }
}

