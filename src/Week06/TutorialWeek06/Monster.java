package Week06.TutorialWeek06;

public abstract class Monster {
    //Attributes
    private String name;
    //Constructors
    public Monster() {}
    public Monster(String name) {
        this.name = name;
    }

    //Getter Method
    public String getName() {
        return this.name;
    }

    abstract String attack();

    public static void main(String[] args) {
        // Polymorphism: Substituting superclass reference with subclass instances
        Monster m1 = new FireMonster("Inferno");
        Monster m2 = new WaterMonster("Aqua");
        Monster m3 = new StoneMonster("Rocky");

// Invoking attack() on each monster
        System.out.println(m1.attack()); // Calls FireMonster's attack
        System.out.println(m2.attack()); // Calls WaterMonster's attack
        System.out.println(m3.attack()); // Calls StoneMonster's attack

// Reassigning superclass reference to another subclass instance
        m1 = new StoneMonster("Golem");
        System.out.println(m1.attack()); // Now calls StoneMonster's attack

// We have a problem here!!!
// Monster m4 = new Monster("u2u2");
// System.out.println(m4.attack()); // garbage!!!
// !^_&^$@+%$* I don't know how to attack!

// Handling scenario where an instance of the superclass is directly created
        Monster m5 = new Monster("Unknown") {
            @Override
            public String attack() {
                return "I am a generic monster and have no specific attack!";
            }
        };
        System.out.println(m5.attack()); // Generic attack message
    }
}

class FireMonster extends Monster {
    public FireMonster() {};
    public FireMonster(String name) {
        super(name);
    };

    public String attack() {
        return this.getName() + " attacks with fire!";
    }
}

class WaterMonster extends Monster {
    public WaterMonster() {};
    public WaterMonster(String name) {
        super(name);
    };

    public String attack() {
        return this.getName() + " attacks with water!";
    }
}

class StoneMonster extends Monster {
    public StoneMonster() {};
    public StoneMonster(String name) {
        super(name);
    };

    public String attack() {
        return this.getName() + " attacks with stones!";
    }
}