public class Knight extends Fighter {
    public Knight(String name) {
        super(name);
    }
    @Override
    public void takeDamage(int damage){
        setHealth(damage -1); 
    }
}
