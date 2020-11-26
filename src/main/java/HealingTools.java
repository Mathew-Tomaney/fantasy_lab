public enum HealingTools {
    POTION(-10),
    MEDKIT(-50);

    private final int healing;

    HealingTools(int healing){
        this.healing = healing;
    }

    public int getHealing(){
        return this.healing;
    }
}
