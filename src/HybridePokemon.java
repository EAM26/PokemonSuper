public class HybridePokemon extends WaterPokemon implements PlusFire{
    private int heat;
    public HybridePokemon(String name, int healthPoints, String sound, String food, int blastPower, boolean fireResistant, int heat) {
        super(name, healthPoints, sound, food, blastPower, fireResistant);
        this.heat = heat;
    }

    public void heatUp() {
        System.out.println(this.getName() + " is heating up to 1000 degrees!");
    }
    public void flameThrower() {
        System.out.println(this.getName() + " is throwing flames with " + this.getHeat() + " points.");
    }

    public int getHeat() {
        return heat;
    }

    public void attack() {
        super.waterBlast();
        this.flameThrower();
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }
}
