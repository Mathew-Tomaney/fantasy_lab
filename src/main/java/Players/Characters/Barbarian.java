package Players.Characters;

import Players.Types.Fighter;

public class Barbarian extends Fighter {
    private int damageBonus;

    public Barbarian(String name) {
        super(name);
        this.damageBonus = 10;
    }

    @Override
    public int action() {
        if(getHealth() <= getMaxHealth()*0.25){
            return getSelectedWeapon().getDamage() + (damageBonus*3);
        } else if(getHealth() <= getMaxHealth()/2) {
            return getSelectedWeapon().getDamage() + (damageBonus * 2);
        }
        return getSelectedWeapon().getDamage() + damageBonus;
    }
}
