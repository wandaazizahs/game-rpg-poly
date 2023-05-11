public class Fighter extends Hero{
    Fighter(String name, int level, int hp, int def, String role) {
        super(name, level, hp, def, role);
    }
    public void move(){
        System.out.println("Fighter Harry moves.");
        System.out.println("FIghter Harry attacks Enemy Goblin with a special move!");
    }
    
}
