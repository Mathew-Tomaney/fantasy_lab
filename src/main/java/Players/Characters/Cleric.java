package Players.Characters;

import Players.Utilities.HealingTools;
import Players.Player;

import java.util.ArrayList;

public class Cleric extends Player {

    private ArrayList<HealingTools> healingTools;
    private HealingTools selectedTool;

    public Cleric(String name) {
        super(name);
        this.healingTools = new ArrayList<HealingTools>();
        this.selectedTool = null;
    }


    public int action() {
        return this.selectedTool.getHealing();
    }

    public void swap(int index) {

    }

    public ArrayList<HealingTools> getHealingTools() {
        return healingTools;
    }

    public void addHealingTool(HealingTools healingTool) {
        this.healingTools.add(healingTool);
    }
}
