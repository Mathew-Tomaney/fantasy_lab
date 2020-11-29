package Players.Utilities;

public enum Weapons {
    SWORD(10),
    AXE(20),
    MACE(5);
    
    private final int damage;
    
    Weapons(int damage){
        this.damage = damage;
    }
    
    public int getDamage(){
        return this.damage;       
    }
}
