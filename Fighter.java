public class Fighter {
    String name;
    int health;
    int attackPower;

    public Fighter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.attackPower;
        System.out.println(this.name + " ne " + opponent.name + " ko " + this.attackPower + " damage diya hai!");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Ali", 100, 20);
        Fighter fighter2 = new Fighter("Aisha", 120, 15);

        System.out.println("Ladai shuru!");
        System.out.println(fighter1.name + " vs " + fighter2.name);
        System.out.println("--------------------");

        while (fighter1.isAlive() && fighter2.isAlive()) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);

            System.out.println("Bachhi hui HP:");
            System.out.println(fighter1.name + ": " + fighter1.health);
            System.out.println(fighter2.name + ": " + fighter2.health);
            System.out.println();
        }

        if (fighter1.isAlive()) {
            System.out.println(fighter1.name + " jeeta!");
        } else {
            System.out.println(fighter2.name + " jeeta!");
        }
    }
}
