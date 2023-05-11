public class Enemy extends Character{
    static int baseAtk = 46;
    Weapon wpn = new Weapon(50, "Celurit", false, 100);

    Enemy(int level, int hp, int def, String role){}
    Enemy(String name, int level, int hp, int def, String role){
        super(name, level, hp, def, role);
    }

    void displayStats(){
        super.displayStats(baseAtk);
        wpn.displayStats(super.getName());
    }

    void attack(Character ch){
        super.attack(ch, baseAtk, wpn);
    }

    void doubleAttack(Character ch){
        super.doubleAttack(ch, baseAtk, wpn);
    }

    void remedy(){
        setHp(getHp()+100);
    }

    void ultimate(Character opponent){
        this.attack(opponent);
        this.remedy();
    }

    public void move() {
        System.out.println("Enemy Goblin moves attacks Hero Harry.");
    }
    public void move(int step){
        System.out.println("Enemy goblin moves " + step + " steps forward" );
    }
    
}
