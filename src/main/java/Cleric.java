public class Cleric extends Player {

    public Cleric(String name) {
        super(name);
    }

    public int action() {
        return this.selectedTool.getHealing();
    }

    public void swap(int index) {

    }
}
