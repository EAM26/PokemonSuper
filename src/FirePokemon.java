public class FirePokemon extends PokemonSuper{

    private int heat;
    private boolean burnImunity;

    public FirePokemon(String name, int healthPoints, String sound, String food, int heat, boolean burnImunity) {
        super(name, healthPoints, sound, food);
        this.heat = heat;
        this.burnImunity = burnImunity;

    }

    public void flameThrower() {
        System.out.println(this.getName() + " is throwing flames with " + this.getHeat() + " points.");
    }

    @Override
    public void attack() {
        this.flameThrower();
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public boolean isBurnImunity() {
        return burnImunity;
    }

    public void setBurnImunity(boolean burnImunity) {
        this.burnImunity = burnImunity;
    }
}
