public abstract class Player {

    private String name;
    private int health;
    private int gold;

    public Player(String name){
        this.name = name;
        this.health = 100;
        this.gold = 0;

    }
    
    public String getName(){
        return this.name;
    } 
    
    public abstract int action();

    public abstract void swap(int index);

    public void collect(Treasure treasure){
        this.gold += treasure.getValue();
    }

    public String move(){
        return "Player has moved";
    }
}
