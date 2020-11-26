import java.util.ArrayList;

public abstract class Fighter extends Player {

    private ArrayList<Weapons> weapons;
    private Weapons selectedWeapon;

    public Fighter(String name) {
        super(name);
        this.weapons = new ArrayList<Weapons>();
        this.selectedWeapon = null ;
    }

    public void addWeapon(Weapons weapon){
        this.weapons.add(weapon);
        this.selectedWeapon = weapons.get(0);
    }


    public int action() {
        return this.selectedWeapon.getDamage();

    }

    public void swap(int index) {
    this.selectedWeapon = weapons.get(index);
    
    }
}
