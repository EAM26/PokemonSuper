public abstract class PokemonSuper {

    private String name;
    private int healthPoints;
    private String sound;
    private String food;

    // attack method to be implemented with other attack methods
    public abstract void attack();

//     Speak method with unique sound
    public void speak() {
        System.out.println(this.getName() + " is saying: MWAUHHH");
    }

    // Eat method with unique food
    public void eat() {
        System.out.println(this.getName() + " is eating: " + this.getFood());
    }

    public PokemonSuper(String name, int healthPoints, String sound, String food) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
