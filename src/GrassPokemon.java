public class GrassPokemon extends PokemonSuper{

    private int healingPower;
    private boolean waterResistant;
    public GrassPokemon(String name, int healthPoints, String sound, String food, int healingPower, boolean waterResistant) {
        super(name, healthPoints, sound, food);
        this. healingPower = healingPower;
        this.waterResistant = waterResistant;
    }

    public void solarBeam() {
        System.out.println(this.getName() + " is attacking with Solar Beam!!!!");
    }
    @Override
    public void attack() {
        solarBeam();
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    public boolean isWaterResistant() {
        return waterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }
}
