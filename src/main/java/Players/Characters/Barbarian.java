package Players.Characters;

import Players.Types.Fighter;

public class Barbarian extends Fighter {
    public Barbarian(String name) {
        super(name);
    }

    @Override
    public int action() {
        return getSelectedWeapon().getDamage()+10;
    }
}
