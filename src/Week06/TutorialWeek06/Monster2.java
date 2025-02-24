package Week06.TutorialWeek06;

interface SpecialAbility {
    void transform();
    void teleport(Point2D position);
}

abstract class Monster2 implements SpecialAbility, Movable {
    //Attributes
    private String name;
    private int health = 100;
    private int attackPower = 1;
    private Point2D position = new Point2D();

    //Constructors
    public Monster2() {}

    public Monster2(String name) {
        this.name = name;
    }

    public Monster2(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Monster2(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public Monster2(String name, int health, int attackPower, Point2D position) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.position = position;
    }

    //Getter Method
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public Point2D getPosition() {
        return position;
    }

    //Setter Method

    public void setName(String name) {
        this.name = name;
    }

    public void decreaseHealth() {

    }

    public void raiseAttackPower(int amount) {
        this.attackPower = this.attackPower + amount;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    abstract void attack();

    public void moveUp() {}

    public void moveDown() {}

    public void moveLeft() {}

    public void moveRight() {}

    public void teleport(Point2D position) {
        System.out.println(this.name + " teleports to " + position + ".");
    }
}

class Goblin extends Monster2 {
    //Constructors
    public Goblin() {
    }

    public Goblin(String name) {
        super(name);
    }

    public Goblin(String name, int health) {
        super(name, health);
    }

    public Goblin(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public Goblin(String name, int health, int attackPower, Point2D position) {
        super(name, health, attackPower, position);
    }

    public void attack() {
        System.out.println(this.getName() + " (Goblin) attacks with a club!");
    }

    public void transform() {
        System.out.println(this.getName() + " transforms into Hulk!");
    }

    @Override
    public void moveUp() {
        getPosition().setY(getPosition().getY() - 1.0);
    }

    @Override
    public void moveLeft() {
        getPosition().setX(getPosition().getX() + 1.0);
    }
}

class Zombie extends Monster2 {
    //Constructors
    public Zombie() {}

    public Zombie(String name) {
        super(name);
    }

    public Zombie(String name, int health) {
        super(name, health);
    }

    public Zombie(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public Zombie(String name, int health, int attackPower, Point2D position) {
        super(name, health, attackPower, position);
    }

    public void attack() {
        System.out.println(this.getName() + " (Zombie) attacks by biting!");
    }

    public void transform() {
        System.out.println(this.getName() + " transforms into Terminal!");
    }


    @Override
    public void moveDown() {
        getPosition().setY(getPosition().getY() - 1.0);
    }

    @Override
    public void moveRight() {
        getPosition().setX(getPosition().getX() - 1.0);
    }
}

class Vampire extends Monster2 {
    //Constructors
    public Vampire() {}

    public Vampire(String name) {
        super(name);
    }

    public Vampire(String name, int health) {
        super(name, health);
    }

    public Vampire(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public Vampire(String name, int health, int attackPower, Point2D position) {
        super(name, health, attackPower, position);
    }

    public void attack() {
        System.out.println(this.getName() + " (Vampire) attacks by sucking blood!");
    }

    public void transform() {
        System.out.println(this.getName() + " transforms into a bat!");
    }

    @Override
    public void moveLeft() {
        getPosition().setX(getPosition().getX() - 1.0);
        getPosition().setY(getPosition().getY() - 1.0);
    }

    @Override
    public void moveRight() {
        getPosition().setX(getPosition().getX() + 1.0);
        getPosition().setY(getPosition().getY() - 1.0);
    }
}