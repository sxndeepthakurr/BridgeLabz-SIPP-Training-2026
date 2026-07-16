package Game;
public class GameDemo {

    static class GameCharacter {
        String characterName;

        GameCharacter(String name) {
            this.characterName = name;
        }

        void performAttack() {
            System.out.println(characterName + " attacks normally");
        }
    }

    static class Warrior extends GameCharacter {
        Warrior(String name) {
            super(name);
        }

        void performAttack() {
            System.out.println(characterName + " attacks with Sword");
        }
    }

    static class Mage extends GameCharacter {
        Mage(String name) {
            super(name);
        }

        void performAttack() {
            System.out.println(characterName + " casts Fireball");
        }
    }

    static class Archer extends GameCharacter {
        Archer(String name) {
            super(name);
        }

        void performAttack() {
            System.out.println(characterName + " shoots Arrow");
        }
    }

    static void startBattle(GameCharacter[] characters) {

        int w = 0, m = 0, a = 0;

        for (GameCharacter c : characters) {
            c.performAttack();

            if (c instanceof Warrior) w++;
            else if (c instanceof Mage) m++;
            else if (c instanceof Archer) a++;
        }

        System.out.println("\nWarriors: " + w);
        System.out.println("Mages: " + m);
        System.out.println("Archers: " + a);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Arjun"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Bheem"),
                new Mage("Harry")
        };

        startBattle(characters);
    }
}