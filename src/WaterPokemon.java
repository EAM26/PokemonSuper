public class WaterPokemon extends PokemonSuper{

    private int blastPower;
    boolean fireResistant;

    public WaterPokemon(String name, int healthPoints, String sound, String food, int blastPower, boolean fireResistant) {
        super(name, healthPoints, sound, food);
        this.blastPower = blastPower;
        this. fireResistant = fireResistant;
    }

    public void speak() {
        System.out.println(this.getName() + " is saying: " + this.getSound());
    }

    public void surf() {
        System.out.println(this.getName() + " is surfing the waves!!!!!1");
    }
    public void waterBlast() {
        System.out.println(this.getName() + " blasts water with " + this.getBlastPower() + " points.");
    }

    @Override
    public void attack() {
        this.waterBlast();
    }

    public int getBlastPower() {
        return blastPower;
    }

    public void setBlastPower(int blastPower) {
        this.blastPower = blastPower;
    }

    public boolean isFireResistant() {
        return fireResistant;
    }

    public void setFireResistant(boolean fireResistant) {
        this.fireResistant = fireResistant;
    }
}
