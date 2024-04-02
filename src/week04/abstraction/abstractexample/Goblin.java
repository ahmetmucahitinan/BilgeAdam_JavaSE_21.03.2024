package week04.abstraction.abstractexample;

public class Goblin extends Enemy{
    public Goblin(){
        this.health = 50;
        this.damage = 10;
    }
    @Override
    public void attack() {
        System.out.println("Goblin attack with " + damage + " damage");
    }
}
