package Dungeon;

public class Treasure {

    private String description;
    private int value;

    public Treasure(String description, int value){
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public int getValue(){
        return value;
    }
}
