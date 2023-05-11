public class App {

    public static void main(String[] args) {
        
        //static polymorphism pada class hero
        Hero hero = new Hero("Superman", 0, 0, 0, null);
        hero.move();
        hero.move("left");

        //static polymorphism pada class enemy
        Enemy enemy = new Enemy("Goblin", 0, 0, 0, null);
        enemy.move();
        enemy.move(5);

        //dynamic polymorphism pada class character
        Character character1 = new Hero("Superman", 0, 0, 0, null);
        character1.move();

        Character character2 = new Enemy("Goblin", 0, 0, 0, null);
        character2.move();

        Character character3 = new Fighter("Harry", 0, 0, 0, null);
        character3.move();

        Character character4 = new Witch("Voldemort", 0, 0, 0, null);
        character4.move();

        //dynamic polymorphism: cast dari witch ke fighter
        Character character5 = new Witch("Voldemort", 0, 0, 0, null);
        character5.move();
        character5 = new Fighter("Harry", 0, 0, 0, null);
        character5.move();
      

        
    }
    
}
