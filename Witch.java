public class Witch extends Enemy{
    Witch(String name, int level, int hp, int def, String role) {
        super(name, level, hp, def, role);
    }
    public void move() {
        System.out.println("Witch Voldemort moves fast.");
        System.out.println("Witch casts a spell!");
    }
    
}
