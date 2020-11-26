public class Dwarf extends Fighter {
    public Dwarf(String name){
        super(name);
    }
    
    public int action(){
        increaseHealth(2);
        return getSelectedWeapon().getDamage();
    }
}
